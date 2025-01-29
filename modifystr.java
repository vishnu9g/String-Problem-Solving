public class modifystr 
{
    // Modifying vowels character into '*' otherwise Modifying normal character into '#' in a String
    public static void main(String[] args)
    {
        String s ="HeLLO";
        for(int i =0;i<s.length();i++)
        {
            if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
            {
                String r = String.valueOf(s.charAt(i));
                s = s.replace(r,"*");
            }
            else if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                String r = String.valueOf(s.charAt(i));
                s = s.replace(r,"*");
            }
            else
            {
                String r = String.valueOf(s.charAt(i));
                s = s.replace(r,"#");
            }
        }
        System.out.print(s);
    }
}
