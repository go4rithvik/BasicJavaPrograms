
package tuitionpractice;


public class BuildingBlock {
    public static void main(String[]args)
    {
        int k=mechanic(5,10);
        System.out.println(k);
    }
      public static int mechanic(int i, int j){
          int max=Math.max(i,j);
          return max;
            
      }
    
}
