import java.util.Scanner;
class strig{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String m1=" Hello";
        String m2="Hi";
       System.out.println("contains the  character:"+m1.contains("lo"));
       System.out.println("length of string:"+m1.length());
       System.out.println("to upperCase:"+m1.toUpperCase());
       System.out.println("position of character:"+m1.charAt(1));
       System.out.println("substring:"+m1.substring(1,3));
       System.out.println("concate the string:"+m1.concat(m2));
       System.out.println("to lowercase:"+m1.toLowerCase());
       System.out.println("compare 2 string:"+m2.compareTo(m1));
       System.out.println("intern:"+m1.intern());
       System.out.println("index:"+m2.indexOf('l'));
       System.out.println("replace:"+m1.replace('l','a'));
       System.out.println("endswith:"+m1.endsWith("o"));
       System.out.println("startswith:"+m1.startsWith("o"));
       System.out.println("equal strings or not:"+m2.equals(m1));
       System.out.println("trim:"+m1.trim());
       

    }
}