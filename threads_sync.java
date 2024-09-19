//  class threads implements Runnable {

//         public void run()
//         {
//            System.out.println("hello indians"); 
//         }

// }
// class thread_sync 
// {
//     public static void main(String[] args) {
//         threads ts=new threads();
//         Thread t=new Thread(ts);
//         t.start();
//         try
//         {
//             t.join();
//         }
//         catch(Exception e)
//         {
//             e.printStackTrace();
//         }

//         for(int i=0; i<=10; i++)
//         {
//             System.out.println(i);
//         }

//     }
// }

class a {
    int count = 0;

    synchronized void ab() {
        count++;
    }
}

class threads_sync {
    public static void main(String[] args) throws Exception {
        a ob = new a();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    ob.ab();
                }

            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    ob.ab();
                }

            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(ob.count);
    }
}