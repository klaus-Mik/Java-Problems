package recursions;

public class seubsequence {
    static void subse(String s, String current , int index){
        if(index==s.length()){
            System.out.println(current);
            return;
        }
        subse(s, current, index+1);
        subse(s, current+s.charAt(index), index+1);
    }
    public static void main(String[] args) {
        String s="abcd";
        String current="";
        subse(s,current,0);

    }
}
