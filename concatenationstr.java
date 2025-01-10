public class concatenationstr
 {
    // Adding both the Strings
    public static void main(String[] args)
    {
      String s1="AI & ";
      String s2="Data Science";
      // Method 1 
      String add = s1+s2;
      // Method 2
      String add1 = s1.concat(s2);
      System.out.println(add);
      System.out.print(add1);
        
    }
    
}
