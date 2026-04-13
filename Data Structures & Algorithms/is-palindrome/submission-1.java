class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i < j){
            char ii = s.charAt(i);
            char jj = s.charAt(j);
            if(!Character.isLetter(jj) && !Character.isDigit(jj)){
            j--;
            continue;
            }
            if(!Character.isLetter(ii) && !Character.isDigit(ii)){
            i++;
            continue;
            }
            if(Character.toLowerCase(jj) != Character.toLowerCase(ii)){
                System.out.println(jj);
                System.out.println(ii);
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
