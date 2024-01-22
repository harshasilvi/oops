package exception;

public class TrywithNestedCatchFinally {
    public static void main(String[] args) {

        try {
            System.out.println("line 1 before error code");
            System.out.println("line 2 before error code");
//            System.out.println(10/0);
            System.out.println("line 3 after error code");//this will never be executed

            try {
                System.out.println("nested try block line1 before error code");
                System.out.println(10 / 0);
                System.out.println("nested try block line3 after error code");
            } catch (Exception e) {
                System.out.println("nested catch block");
                System.out.println("nested catch block -2nd line");
            } finally {
                System.out.println("nested finally block");
            }
            System.out.println("nested try catch lst statment after finally block");
            System.out.println(10 / 0);
        }

        catch(ArithmeticException ae){
           // System.out.println("parent try block-catch statmennt");
            System.out.println(10 / 0);
        }
        finally{
            System.out.println("parent try block-finally statmennt");
            System.out.println(10 / 0);
        }
        System.out.println("parent try block-catch statmennt after finally");
    }
}
