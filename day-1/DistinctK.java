import java.util.*;
public class DistinctK {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] l=new String[n];
        
        for(int i=0;i<n;i++){
            l[i]=sc.next();
        }
        int k=sc.nextInt();
       Map<String,Integer> ans=new HashMap<>();
       for(int i=0;i<l.length;i++){
        if(ans.containsKey(l[i])){
            ans.put(l[i],ans.get(l[i])+1);
        }
        else{
            ans.put(l[i], 1);
        }
       }
        
        List<String> jo=new ArrayList<>();
        for(int i=0;i<l.length;i++){
            if(ans.get(l[i])==1){
                jo.add(l[i]);
            }
            
        }
        if(k<jo.size()){
            System.out.println(jo.get(k-1));

        }
        else{
            System.out.println("-1");
        }
    }
    
}
