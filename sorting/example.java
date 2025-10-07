public class example {
    public static double shorte(String s){
        int x=0;
        int y=0;
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='w'){
                x-=1;
                
            }
            else if(c=='e'){
                x+=1;
                
            }
            else if(c=='n'){
                y+=1;
            }
            else if(c=='s'){
                y-=1;
            }
        }
       
        double h=Math.sqrt(x*x+y*y);
        return h;

    }
    
    public static void main(String[] args){
        String s="wneenesennn";
        System.out.println(shorte(s));
    }
}
