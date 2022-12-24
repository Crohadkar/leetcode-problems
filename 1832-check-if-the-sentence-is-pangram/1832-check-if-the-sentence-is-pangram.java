class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        HashSet<Character> s = new HashSet<>();
        for(int i=0;i<sentence.length();i++)
            s.add(sentence.charAt(i));
        return (s.size()==26);
    }
}