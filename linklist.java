class linklist
{
    class Node
    {
        String data;
        Node next;
    }
    Node(String data)
    {
        this.data=data;
        this.next=null;
    }
    public void addFirst(String data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

    public static void main(String[] args) {
        linklist ll=new linklist();

    }
}