package recursions;

public class palindrome {
    static boolean pali(String s, int i, int j){
       
        if(i>=j){
            return true;
        }
        if(s.charAt(i)!=s.charAt(j)){
            return false;
            
        }
        return pali(s, i+1, j-1);
        
    }
    public static void main(String[] args) {
       
        String s="abcba";
       
        System.out.println(pali(s, 0, s.length()-1));
    }
}
