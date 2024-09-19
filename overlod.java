class overlod
{
    int x;
        void sum(int a,int b)
        {
            x=a-b;
        }
        void show()
        {
            System.out.println(x);

        }
        void sum(int a,int b,int c)
        {
            x=a-b-c;
        }
        void prin()
        {
            System.out.println(x);
        }
        void sum()
        {
            int a=20,b=30;
            x=a+b;
            System.out.println(x);
        }

        public static void main(String[] args) {
        
        
            overlod ob=new overlod();
            ob.sum(4,7);
            ob.show();
            ob.sum(4,5,6);
            ob.prin();
            ob.sum();

        
    }       

}
