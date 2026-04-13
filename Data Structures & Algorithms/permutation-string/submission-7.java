class Solution {
    public boolean checkInclusion(String s1, String s2) {
      HashSet<Character> them = new HashSet<>();
      for(Character i: s1.toCharArray()){
        them.add(i);
      }
      char[] s1array = s1.toCharArray();
      Arrays.sort(s1array);
      String sorteds1 = new String(s1array);

      int len = s1.length();
      for(int j =0; j < s2.length();j++){
        if(them.contains(s2.charAt(j)) && j+len <= s2.length()){
            // System.out.println("am here");
            String temp = s2.substring(j,j+len);
            char[] temparray = temp.toCharArray();
            Arrays.sort(temparray);
            String sortedtemp = new String(temparray);
            // System.out.println(temparray);
            if(sortedtemp.equals(sorteds1)){
                // System.out.println("am here 2");
                return true;
            }
        }
      }
      return false;
    }
}
