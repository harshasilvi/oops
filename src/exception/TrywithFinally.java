package exception;

public class TrywithFinally{
    public static void main(String[] args){
        try{
            System.out.println("line 1 before risky code");
            System.out.println("line 2 before risky code");
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println("code inside catch block");
        }
        finally{
            System.out.println("code inside finally block");
        }
        System.out.println("code after finally block" );
        //result line 1 before risky code
        //line 2 before risky code
        //code inside catch block
        //code inside finally block
        //code after finally bloc
        //Process finished with exit code 0

        //=====same code if catch block error handling code not there==========

        try{
            System.out.println("line 1 before risky code");
            System.out.println("line 2 before risky code");
            System.out.println(10/0);
        }
        catch(ArrayIndexOutOfBoundsException  e){
//        System.out.println("code inside catch block");
        }
        finally{
            System.out.println("code inside finally block");
        }
        System.out.println("code after finally block" );//wont execute as catch block corresponding not there
        //result line 1 before risky code
        //line 2 before risky code
        //code inside finally block
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at exception.TrywithFinally.main(TrywithFinally.java:29)
    }



}
