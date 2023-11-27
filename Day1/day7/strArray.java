import java.util.*;

public class strArray {
    public static void main(String[] args){
        String ans="";
        for(int i=0;i<args.length;i++)
        ans+=args[i];

        System.out.println("Final string is : "+ans);

        Map<Character, Integer> mp=new HashMap<>();
        for(char c: ans.toCharArray()){
            if(mp.containsKey(c)){
                mp.put(c, mp.get(c)+1);
            }
            else{
                mp.put(c, 1);
            }
        }

        System.out.println("Character occurrences :");
        for(Map.Entry<Character,Integer> e:mp.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }
    }
}
