package tuitionpractice;
public class SmallestNum
{
public static void main(String[]args)
 {
  int temp;
  int a[]={7,8,90,34,6,87,75,97};  
   temp=a[0];  
  for(int j=0;j<a.length;j++)
  {
  if(a[j]>temp)
  {
  temp=a[j];
  
  }
 
  
  }
 System.out.println("The max number is"+" "+  temp);
 
 
 
 }
}
