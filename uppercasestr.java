public class uppercasestr {
    // returning uppercase using objects and methods
    public static void upper(String s)
    {
        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            if(c>=65&&c<=90){
                System.out.println(s.charAt(i));
            }
         }
    }
     public static void main(String[] args)
     {
         String s="HeL";
         upper(s);
    }
    
}
