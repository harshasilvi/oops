package exception;

public class throwexception  {

    public static double area(int r) throws NegativeArraySizeException{
        if (r<0){//program will terminate here if r<1
            throw new NegativeArraySizeException() ;//throw keyword
        }
        double result= Math.PI * r*r;
        return result;
    }
    //throws keyword
    public static int divide(int a,int b)throws  ArithmeticException{
        int resul1= a/b; //may throw this exception so handle it in try catch whenver using this method
        return resul1;
    }
    public static void main(String[] args) {
        try{
            double area=  area(6);
        }
        catch(Exception e){
            System.out.println("negative radiuos exception handlede");
        }

      try {
          int c = divide(10, 0);
      }
      catch(Exception ex){
          System.out.println("exception handled");

      }
        System.out.println("after catch block");









        }

}
