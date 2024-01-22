package multithreading;

 class MyThread implements Runnable {
    public void run(){
    //task to perfrom by threads
    for(int i=1;i<=10;i++){
        System.out.println(i);
        try{
            Thread.sleep(2000);
        }
        catch(Excepti-on e){

        }
    public static void main(String[] args){
        MyThread t1= new MyThread();
        Thread th= new Thread(t1);
        th.start();
        //cretaing obj of anotherthread cls
            AnotherThread t2= new AnotherThread();
            t2.start();
    }
}
