import java.util.*;
class PalindromicPermutation{
    
    public static void main(String[] args){
        System.out.println(isPolindramic("carrace"));
    }
    
    static Boolean isPolindramic(String s){
        Map<Character,Integer> cCounter = new HashMap<Character,Integer>();
        for(int i = 0; i < s.length(); i++){
            if(cCounter.get(s.charAt(i)) == null) cCounter.put(s.charAt(i), 1);
            else{
                cCounter.put(s.charAt(i),cCounter.get(s.charAt(i))+1);
            }
        }
        int oddCounter = 0;
        Iterator<Map.Entry<Character, Integer>> it = cCounter.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Character,Integer> pair = it.next();
            if(pair.getValue()%2 == 1)oddCounter++;
            if(oddCounter > 1) return false;
            
        }
        if(oddCounter == 0) return true;
        if(oddCounter == 1 && (s.length() % 2 == 1)) return true;
        return false;
    }
}
