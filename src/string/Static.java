package string;

public class Static {
    int a,b;
    static int c=9;
    public void sayHello(){
        System.out.println("hii");
    }
    public static int age(int i){
        int result = i;
        return result;
    }
    public static void main(String[] args){
//            public static void methidone(){
        int d=87;
        System.out.println(c);
       // System.out.println(a); java: non-static variable a cannot be referenced from a static context
            System.out.println("harsha");
          int c=  age(45);
        Static s = new Static();
        System.out.println(s.a);
        s.sayHello();
        System.out.println(d);
        }
    }

