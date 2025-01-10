public class largestcharatstr {
    //Largest Character in a String
    public static void main(String[] args)
    {
        String s ="hello";
        int max = 0;
       for(int i=0;i<s.length();i++)
       {
        if(s.charAt(i)>max)
        {
            max = s.charAt(i);
        }
       }
       //converting ascii value into character
       char m = (char) max;
       System.out.println(m);
    }
}
