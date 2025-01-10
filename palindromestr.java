public class palindromestr 
{
    //String is Palindrome or Not
    public static void main(String[] args) 
    {
        String s ="racecar";
        String s1="";

        for(int i=s.length()-1;i>=0;i--)
        {
              s1+=s.charAt(i);
        }
        // comparing string using string equals method
        if(s.equals(s1))
        {
            System.out.println("String is Palindrome");
        }
        else
        {
            System.out.println("String is not a Palindrome");
        }
    }
}