class Solution {
     public boolean halvesAreAlike(String s) {
        int i=0;
        int j=s.length()-1;
        int ans =0;
        // int lans =0;
        HashSet<Character> map = new HashSet<>();

        map.add('a'); map.add('i'); map.add('o'); map.add('e'); map.add('u');
        map.add('A'); map.add('I'); map.add('O'); map.add('E'); map.add('U');
        while(i<=j){
           if(map.contains(s.charAt(i)))ans++;
           if(map.contains(s.charAt(j)))ans--;
            i++;
            j--;
        }
        return ans==0;
    }
}