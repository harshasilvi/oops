package exception;

public class Basic {
    public static void main(String[] args){
        System.out.println(//executed
                "line1"
        );
       // System.out.println(10/0);
        System.out.println("line 2");//not executed
        //ressult--line1
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at exception.Basic.main(Basic.java:8)
        //Process finished with exit code 1

        //========same code with try catch block=================**
        System.out.println("line1");
        try{
            System.out.println(10/0);
        }
        catch(Exception e){
            //System.out.println(10/2);
            System.out.println("line2");
        }
        //result==line1
        //if we uncomment lne 20 output 5 will be also b%%e printed
        //line2
        //Process finished with exit code 0
       // =====pratice ===== example 2

        try{
            System.out.println("try without catch,finally,resources");//try' without 'catch', 'finally' or resource declarations
        }
        finally{
            System.out.println("finally");
        }

        ///================ example 3
//        try
//        {
//            int i = Integer.parseInt("abc");   //This statement throws NumberFormatException
//        }
//
//        catch(Exception ex)
//        {
//            System.out.println("This block handles all exception types");
//        }
//
//        catch(NumberFormatException ex)
//        {
//            //Compile time error
//            //This block becomes unreachable as
//            //exception is already caught by above catch block
//        }
        //========example 4=================
        try
        {
            NumberFormatException ex = new NumberFormatException();    //Creating an object to NumberFormatException explicitly

            throw ex;        //throwing NumberFormatException object explicitly using throw keyword
        }
        catch(NumberFormatException ex)
        {
            System.out.println("explicitly thrown NumberFormatException object will be caught here");
            throw ex;//rethrwoing exception
        }

    }



}
