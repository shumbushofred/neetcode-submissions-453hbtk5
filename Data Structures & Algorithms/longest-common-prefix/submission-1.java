class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder str = new StringBuilder();
        int i =0;
        while(i < strs[0].length()){
            char temp = strs[0].charAt(i);
            for(int j=1; j<strs.length;j++){
                if(i < strs[j].length()){
                    char temp2 = strs[j].charAt(i);
                    if(temp2 != temp){
                        return str.toString();
                    }
                }else{
                    return str.toString();
                }

            }
            str.append(temp);
            i++;
        }
        return str.toString();
    }
    
}