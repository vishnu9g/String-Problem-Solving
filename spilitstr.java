public class spilitstr
{
    //spiliting string
    public static void main(String[] args) {
        String s ="Hello World";
        String[] p =s.split(" ");
        
        System.out.print(p[0].charAt(0)+"."+" ");
        System.out.println(p[1]+"");
        
    }
}
