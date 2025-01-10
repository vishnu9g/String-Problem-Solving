public class chararrintostr {
    public static void main(String[] args) 
    {
        //coverting char Array into String
        char[] arr ={'H','e','l','l','o'};
        String s = "";
        for(int i=0;i<arr.length;i++)
        {
            s+=arr[i];
        }
        System.out.println(s);
    }
    
}
