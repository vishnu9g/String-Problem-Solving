public class lengthstr 
{
    public static void main(String[] args) 
    {
        //length of the string
        String s ="Hello";
        int count =0;
        for(char ch : s.toCharArray())
        {
            count++;
        }
        System.out.println(count);
    }
}
