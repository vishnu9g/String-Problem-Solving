public class duplicateremovestr
{
    //removing duplicate value in a String
    public static void main(String[] args)
    {
        String s = "Hello";
        String n="";
        for(int i=0;i<s.length();i++)
        {
            boolean flag = true;
            for(int j=0;j<n.length();j++)
            {
            if(s.charAt(i)==s.charAt(j))
            {
                flag = false;
            }
            }
            if(flag)
            {
            n+=s.charAt(i);
            }
        }
        System.out.print(n);
    }
}