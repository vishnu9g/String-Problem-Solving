class reversingstrobj
{
    public String rev(String n)
    {
        String s="";
        for(int i=n.length()-1;i>=0;i--)
        {
            s+=n.charAt(i);
        }
        return s;
    }
    public static void main(String[] args)
    {
        String n ="Hello";
        reversingstrobj a =new reversingstrobj();
        String r=a.rev(n);
        System.out.println(r);
    }
}