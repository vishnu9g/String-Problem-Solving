public class stringbuilderstr
 {
    public static void main(String[] args)
     {
        //using String Builder for reversing , splitting Strings etc.,
        String s ="Hello";
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        System.out.println(sb);
    }
}
