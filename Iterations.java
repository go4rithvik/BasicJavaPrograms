package tuitionpractice;
import java.util.*;
public class Iterations {
    public static void main(String[]args)
    { 
        //This is a collatz sequence
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int count=0;
       while(n !=1){
           //System.out.println(n);
       if(n%2==0)
       { n=n/2; count=count+1;  }
       
       else
       { n=3*n+1;count=count+1;
       }
       
       
    }
       System.out}
.println(count);
}
}