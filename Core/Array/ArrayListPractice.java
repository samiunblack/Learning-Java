import java.util.ArrayList;

public class ArrayListPractice {
   public static void main(String[] args) {

      ArrayList<Integer> ages = new ArrayList<Integer>();

      ages.add(32);
      ages.add(20);
      ages.add(10);
      ages.add(12);
      ages.add(42);

      System.out.println("array: " + ages);
      System.out.println("length:" + ages.size());
      System.out.println("ages[0] = " + ages.get(0));
      System.out.println("before: ages[0] = " + ages.get(0));
      ages.set(0, 33);
      System.out.println("after: ages[0] = " + ages.get(0));
      ages.remove(0);
      System.out.println("Removed ages[0]. Now ages = " + ages);
      System.out.println("Index of age 10 = "  + ages.indexOf(10));
   }
}   
