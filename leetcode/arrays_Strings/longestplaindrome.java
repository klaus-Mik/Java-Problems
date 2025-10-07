public class longestplaindrome {
   
        public int longestPalindrome(String s) {
            if(s.length()==1){
                return 1;
            }
            int[] freq=new int[128];
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                freq[c]++;
            }
            boolean odd=false;
            int length=0;
            for(int d:freq){
                length+=(d/2)*2;
                if(d%2==1){
                    odd=true;
                }
            }
            if(odd){
                length=length+1;
            }
            return length;
            
        }
    }

