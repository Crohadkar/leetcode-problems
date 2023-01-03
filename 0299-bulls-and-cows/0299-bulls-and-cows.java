class Solution {
    public String getHint(String secret, String guess) {
        int bull =0 ,cows = 0;
        HashMap<Character,Integer> s = new HashMap<>();
        HashMap<Character,Integer> s1 = new HashMap<>();

        for(int i=0;i<secret.length();i++){
             char se = secret.charAt(i);
            char gu = guess.charAt(i) ;
            if(se==gu){
                bull++;
            }else{
               
                 s.put( se ,s.getOrDefault(se, 0) + 1);       
                 s1.put( gu ,s1.getOrDefault(gu, 0) + 1);
            }
                       
        }
        
         for (Character key : s.keySet()) {
             if (s1.containsKey(key)) 
                 cows += Math.min(s.get(key),s1.get(key));
    }
       
         String  ans= bull+"A"+cows+"B";
        return ans ;
        
        
    }
}