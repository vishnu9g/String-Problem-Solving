public class countstr {
    public static void main(String[] args) {
        String s ="aaabbccd";
        int count =0;
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){
            count++;
            if((i+1)>=s.length()||s.charAt(i)!=s.charAt(i+1)){
                res.append(s.charAt(i));
                res.append(count);
                count = 0;
            }
        }
        System.out.println(res.toString());
          
    }
}