
// public class link {

//     public static void display(Node head)
//     {
//         while(head!=null)
//         {
//             System.out.println(head.data);
//             head=head.next;
//         }
//     }
//     public static class Node
//     {
//         int data;
//         Node next;
//         Node(int data)
//         {
//             this.data=data;
//         }
//     }
    
//     public static void main(String[]args)
//     {
//         Node n=new Node(5);
//         Node n1=new Node(6);
//         Node n2=new Node(7);
//         Node n3=new Node(8);
//         Node n4=new Node(9);
//         Node n5=new Node(91);
//         n.next=n1;
//         n1.next=n2;
//         n2.next=n3;
//         n3.next=n4;
//         n4.next=n5;
//         // System.out.println(n.next);
//         // System.out.println(n1);
//         // System.out.println(n.data);
//         // System.out.println(n.next.data);
//         // System.out.println(n.next.next.data);
//         // System.out.println(n.next.next.next.data);
//         // System.out.println(n.next.next.next.next.data);

//         Node temp=n;
//         //System.out.println(temp.data);

//         // for(int i=1; i<=5; i++)
//         // {
//         //     System.out.print(temp.data+" ");
//         //     temp=temp.next;
//         // }

//         while(temp!=null)
//         {
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//         display(n);
        
//     }
    
// }

public class link {

    public static void displayr(Node head)
    {
        if(head==null)
        {
            return;
        }
        displayr(head.next);
        System.out.println(head.data);
        
    }

    public static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node n = new Node(5);
        Node n1 = new Node(6);
        Node n2 = new Node(7);
        Node n3 = new Node(8);
        Node n4 = new Node(9);
        Node n5 = new Node(91);

        n.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        display(n); 
        display(n);
        displayr(n);
       
        
    }
}
