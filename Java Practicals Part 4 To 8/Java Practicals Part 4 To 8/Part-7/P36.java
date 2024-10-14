public class P36
{

    static class MyThread extends Thread
    {
        public MyThread(String name)
        {
            super(name);
        }

        @Override
        public void run()
        {
            for (int i = 1; i <= 5; i++)
            {
                System.out.println(getName() + ": " + i);
                try
                {
                    Thread.sleep(500);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args)
    {
        MyThread first = new MyThread("FIRST");
        MyThread second = new MyThread("SECOND");
        MyThread third = new MyThread("THIRD");

        first.setPriority(3);
        second.setPriority(5);
        third.setPriority(7);

        first.start();
        second.start();
        third.start();
    }
}