public class covertionstr 
{
    public static void main(String[] args)
    {
        String s="hELLO";
        System.out.println(convert(s));
        
    }
    public static String convert (String s)
    {
        String c =" ";
        for(int i=0;i<s.length();i++)
        {
           char a=s.charAt(i);
           a=(a>=97)?(char)(a-32):(char)(a+32);
            c+=a;
        }
        return c;
}
    }
   
