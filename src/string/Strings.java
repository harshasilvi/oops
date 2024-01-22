package string;

public class Strings {
    public static void main(String[] args){
        String s1= "harsha";
        String s2="saumya";
        String s3="harsha";
        String s4= new String("saumya");
        String s5 =new String("silvi");
        String s6 =new String("silvi");

        System.out.println(s1==s2);//false
        System.out.println(s1==s3);//true
        System.out.println(s1==s4);//false
        System.out.println(s2==s4);//false
        System.out.println(s4==s5);//false
        System.out.println(s1.equals(s3));//true
        System.out.println(s2.equals(s4));//true
        System.out.println(s1.equals(s4));//false
        System.out.println(s5.equals(s6));//true
        System.out.println(s5==s6);//false

        StringBuffer buffer = new StringBuffer("harsha");
      //  buffer.concat("singh");
        System.out.println(buffer);
        StringBuffer buffer1 = new StringBuffer("harsha");
        System.out.println(buffer1==buffer);//false??why
        //java: incompatible types: java.lang.String cannot be converted to java.lang.StringBuffer
//        StringBuffer buffer2 =  "harsha";
//        StringBuffer buffer3 =  "harsha";
//        System.out.println(buffer2==buffer3);//false

//immutable
        String str= new String("deepak ");
        str.concat(" parmar");
        System.out.println(str);// deepak
        str=str.concat("parmar");
        System.out.println(str);// deepak parmar

    }
}
