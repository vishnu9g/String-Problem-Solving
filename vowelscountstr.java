public class vowelscountstr 
{
    //count vowels in a String
    public static void main(String[] args) 
    {
        String v = "Hello Everyone , Welcome to the World AI and Data Science";
        int count =0;
        for(int i=0;i<v.length();i++)
            {
            if(v.charAt(i)=='a'||v.charAt(i)=='A')
            {
                System.out.println("Vowel Letter is : "+v.charAt(i));
                count++;
            }
            else if(v.charAt(i)=='e'||v.charAt(i)=='E')
            {
                System.out.println("Vowel Letter is : "+v.charAt(i));
                count++;
            }
            else if(v.charAt(i)=='i'||v.charAt(i)=='I')
            {
                System.out.println("Vowel Letter is : "+v.charAt(i));
                count++;
            }
            else if(v.charAt(i)=='o'||v.charAt(i)=='O')
            {
                System.out.println("Vowel Letter is : "+v.charAt(i));
                count++;
            }
            else if(v.charAt(i)=='u'||v.charAt(i)=='U')
            {
                System.out.println("Vowel Letter is : "+v.charAt(i));
                count++;
            }
        }
               System.out.println("Total no of Vowels letter : "+count);
    }
}
    

