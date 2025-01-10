public class firstnonrepeatingcharstr
{
    // Finding first non repeating character in a given string
 public static void main(String[] args)

 {
     String s="hello";
      for(int i=0;i<s.length();i++)
      {
        if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i)))
        {
            System.out.println(s.charAt(i)+" no repeat");
            break;
        }
     }
 }
    
}
