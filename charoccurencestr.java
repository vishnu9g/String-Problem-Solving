

public class charoccurencestr 
{
    public static void main(String[] args) 
    //number of character occurence
    {
        String s ="Hello";
        char c ='l';
        int count=0;
        for(int i=0;i<s.length();i++)
        {
           if(c==s.charAt(i))
           {
            count++;
           }        
        }
        System.out.println(count);

    }
    
}
