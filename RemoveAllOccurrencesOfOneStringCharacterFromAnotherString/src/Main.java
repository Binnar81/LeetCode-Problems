 class Solution {
    public static String removeAllOccurrences(String s, String part){
        int index=s.indexOf(part);
        if(index==-1){
            return s;
        }
        return removeAllOccurrences(s.substring(0,index)+s.substring(index+part.length()),part);
    }
    public static void main(String[] args) {
       String ans=removeAllOccurrences("npmabcmbvabcmnc","abc");
        System.out.print(ans);
    }
}