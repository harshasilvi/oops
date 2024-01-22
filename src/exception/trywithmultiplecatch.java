package exception;

import java.io.IOException;

public class trywithmultiplecatch {
    public static void main(String[] args) {

//        try {
//            System.out.println("line 1 before error code");
//            System.out.println("line 2 before error code");
//            System.out.println(10 / 0);
//            System.out.println("line 3 after error code");//this will never be executed
//        } catch (ArithmeticException  e) {
//            System.out.println("catch block");}
//
//
//        catch (Exception  ex) {
//                System.out.println("catch block-parent");
//
//            }
//
//        finally {
//            System.out.println("finally block");
//        }
//        System.out.println("lst line after finally block");
        ///result-ava: Alternatives in a multi-catch statement cannot be related by subclassing
        //  Alternative java.lang.ArrayIndexOutOfBoundsException is a subclass of alternative java.lang.Exception

        try {
            try{//to handle cant reach statemnt after checked exception
           throw new IOException();
            }
            catch(IOException e) {
                System.out.println("harsha");
            }

            System.out.println("line 1 before error code");
            System.out.println("line 2 before error code");
            System.out.println(10 / 0);

            System.out.println("line 3 after error code");//this will never be executed

        } catch (   ArithmeticException e) {
            System.out.println("catch block");
        } finally {
            System.out.println("finally block");
        }
        System.out.println("lst line after finally block");

    }}
