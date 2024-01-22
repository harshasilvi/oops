package multithreading;

class UserThread extends Thread{
    public void run(){
        System.out.println("userthread");
    }
}
public class ThreadOperations {
    public static void main(String[] args){
        System.out.println("program started");
        Thread t= Thread.currentThread();
       String tname= t.getName();
        System.out.println(tname);
        //set name
        t.setName("mymain");
        System.out.println(t);
        System.out.println(t.getId());
        try{
            Thread.sleep(2000);
        }
        catch(Exception e){

        }
        System.out.println("program ended");
        UserThread thread= new UserThread();
        thread.start();
    }
}
