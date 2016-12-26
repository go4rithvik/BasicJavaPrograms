package tuitionpractice;

public class StringUsage {

    public static void main(String[]args)
    {
        String k="banana";
        System.out.println(k);
        char f=k.charAt(4);
        System.out.println(f);
       System.out.println(k.indexOf('a',2));
        Boolean x=k.matches("banana");
        System.out.println(x);
        System.out.println(k.length());
     // int i=100;
      // System.out.println(i/0);
    }        
}