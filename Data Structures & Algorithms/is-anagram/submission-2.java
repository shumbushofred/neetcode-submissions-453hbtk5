class Solution {
    public boolean isAnagram(String s, String t) {
        char[] thes = s.toCharArray();
        char[] thet = t.toCharArray();
        Arrays.sort(thes);
        Arrays.sort(thet);

       return Arrays.equals(thes, thet);
    }
}
