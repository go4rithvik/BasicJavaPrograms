/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuitionpractice;

/**
 *
 * @author Rithvik
 */
public class BubbleSort {
    
    public static void main(String[]args)
    {
      int a[]=new int[]{45,8,92,6,18,94,5,9,98,4};
      for(int x=1;x<=10;x++)
      
      {
         for(int i=0;i<=8;i++)
         
         {
             if(a[i]>a[i+1])
                 
             {
                 int b;
                 b=a[i];
                 a[i]=a[i+1];
                 a[i+1]=b;
                 
             }
            
         }
      
      }
      for(int j=0;j<=9;j++) {
      System.out.println(a[j]);
      }
    }
}
