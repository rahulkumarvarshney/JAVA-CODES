import java.util.Stack;

class stackcopy {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        Stack<Integer> gt = new Stack<>();
        // while(st.size()>0)
        // {
        //     int x=st.peek();
        //     gt.push(x);
        //     st.pop();
        // }

        while(st.size()>0)
        {
            gt.push(st.pop());
        }
        System.out.println(gt);
        Stack<Integer> gtt = new Stack<>();
        while(gt.size()>0)
        {
            gtt.push(gt.pop());
        }
        System.out.println(gtt);
        while(gtt.size()>0)
        {
            st.push(gtt.pop());
        }
        System.out.println(st);
        int ele=2;
        int ind=2;

        while(st.size()>ind)
        {
            gt.push(st.pop());
        }
        System.out.println(st);
        st.push(ele);
        while(gt.size()>0)
        {
            st.push(gt.pop());
        }
        System.out.println(st);
    }
}