 //reverse the given string words
 class ReverseWords {
    public static String reverseWords(String str){
        String[] s=str.trim().split("\\s+");
        StringBuffer sb=new StringBuffer();
        for(int i=s.length-1;i>=0;i--){
            sb.append(s[i]+ " ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        String str="I am sanjay";
        String ans=reverseWords(str);
        System.out.println(ans);
    }
}