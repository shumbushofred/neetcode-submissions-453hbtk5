class Solution {
    public boolean isAnagram(String s, String t) {
        char[] thes = s.toCharArray();
        char[] thet = t.toCharArray();
        Arrays.sort(thes);
        Arrays.sort(thet);
        String thess = Arrays.toString(thes);
        String thett = Arrays.toString(thet);
        return thess.equals(thett);
       //return Arrays.equals(thes, thet);
    }
}
