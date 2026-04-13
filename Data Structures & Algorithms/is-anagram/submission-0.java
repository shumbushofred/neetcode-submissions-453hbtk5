class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] thes = new int[26];
        int[] thet = new int[26];
        for(int y =0; y < s.length();y++){
           thes[s.charAt(y) - 'a']++;
           thet[t.charAt(y) - 'a']++;
        }
        for(int z =0; z < thet.length;z++){
           // System.out.println(thes[z]);
           // System.out.println(thet[z]);
           if (thes[z] != thet[z]) return false;
        }
        return true;
    }
}
