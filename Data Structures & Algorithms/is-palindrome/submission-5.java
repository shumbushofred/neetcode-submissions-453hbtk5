class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder d = new StringBuilder();
        for(char z: s.toCharArray()){
            if(Character.isLetterOrDigit(z)){
                d.append(z);
            }
        }
        String helper = d.toString().toUpperCase();
        int i =0;
        int j = helper.length()-1;
        while(i <= j)
        {
            // System.out.println(helper.charAt(i));
            // System.out.println(helper.charAt(j));
            if(helper.charAt(i) != helper.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;

    }
}
