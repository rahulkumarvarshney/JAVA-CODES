public class stack_implement {

    public static class stack
    {
        private int arr[]=new int[3];
       private int idx=0;
        void push(int x)
        {
            if(isfull())
            {
                System.out.println("stack is full");
                return;
            }
            arr[idx] =x;
            idx++;

        }
        int peek()
        {
            if(arr[idx]==0)
            {
                System.out.println("stack is empty");
                return -1;

            }
            return arr[idx-1];
        }
        int pop()
        {
            if(arr[idx]==0)
            {
                System.out.println("stack is empty");
                return -1;

            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;

        }
        void display()
        {
            for(int i=0; i<arr[idx]; i++)
            {
                System.out.println(arr[i]);
            }
            System.out.println();
        }
        int size()
        {
            return idx;
        }
        boolean isEmpty()
        {
            if(idx==0) return true;
            else return false;
        }
        boolean isfull()
        {
            if(idx==arr.length)
            {
                return true;
            }
            else{
                return false;
            }
        }
    

 public static void main(String[] args) {
        stack st=new stack();
        st.push(1);
        st.display();
        st.push(2);
        st.display();
    
    

    }
}
}



