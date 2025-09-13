public class gas {
    public static void circle(int[] gas , int[] cost){
        int tank=0;
        int start=0;
        int total=0;
        for(int i=start;i<gas.length;i++){
            int diff=gas[i]-cost[i];
            tank+=diff;
            total+=diff;
            if(tank<0){
                start=i+1;
                tank=0;
            }
            
        }
        if(total>=0){
            System.out.println(start);
        }
        else{
            System.out.println("-1");
        }
        
    }
    public static void main(String[] args){
       int[] gas={1,2,3,4,5};
       int[] cost={3,4,5,1,2};
       circle(gas, cost);
    }
}
