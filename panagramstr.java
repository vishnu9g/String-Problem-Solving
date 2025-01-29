public class panagramstr
{
    public static void main(String[] args) 
    {
        String s ="The quick brown fox jumps over the lazy dog";
        String a=s.toUpperCase();
        int c =0;
        for(int i=65;i<=90;i++)
        {
            for(int j=0;j<a.length();j++)
            {
                char b =a.charAt(j);
                if(b==i)
                {
                    c++;
                    break;
                }
            }
        }
        if(c==26)
        {
            System.out.println("Panagram String");
        }
    }
    
}
