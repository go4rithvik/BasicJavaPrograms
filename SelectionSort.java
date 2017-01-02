/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuitionpractice;

/**
 *
 * @author Shreya
 */
public class SelectionSort {
 
  public static void main(String[]args)
  {
     int a[]={9,14,3,2,43,11,58,22};
     int f[]=Selection(a);    
      for(int t=0;t<f.length;t++)
    {
    System.out.println(f[t]);
    
    }
    
  }
  public static int[] Selection(int b[])
  {
    for(int i=0;i<b.length-1;i++)
    {   
        
        int temp=b[i]; int k=0;
        for(int j=i;j<b.length;j++)
            
        {
           if(b[j]<temp)
           {
               temp=b[j];
               k=j;
               
           }
            
           
         }
            b[k]=b[i];
            b[i]=temp;
    }
   
   return b;
    }
    
    
  }

