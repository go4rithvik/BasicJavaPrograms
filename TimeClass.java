/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuitionpractice;

public class TimeClass {
int hour,minute; double second;

public TimeClass(){
  this.hour=0;
  this.minute=0;
  this.second=0.0;
}
public TimeClass(int hour,int minute, double second)
{
  this.hour=hour;
  this.minute=minute;
  this.second=second;
}
public static void main(String[]args){
    TimeClass t1=new TimeClass();
    t1.hour=11;t1.minute=8;t1.second=3.14159;
    System.out.println(t1);
    
    TimeClass t2=new TimeClass(11,8,3.14159);
    System.out.println(t2);
}

}
