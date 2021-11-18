//Runnable interface
//public class RunnableInterface {

//}
/*class MyThread1 implements Runnable{
    @Override
    public void run() {
        Thread.currentThread().setName("E custom thread");
        for(int i=0;i<10;i++){
            System.out.println("Mythread1");
        }
    }
}

 */
class Test57{
    public static void main(String[] args) {
       // MyThread1 obj=new MyThread1();
        Thread obj1=new Thread(new MyThread(new Runnable()));{

        }
        obj1.start();
        for(int i=0;i<10;i++){

            System.out.println("main thread");
        }
    }
}