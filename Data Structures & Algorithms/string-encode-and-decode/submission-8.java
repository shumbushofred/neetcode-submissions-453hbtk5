class Solution {

    public String encode(List<String> strs) {
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < strs.size();i++){
            String temp = strs.get(i);
            int num = temp.length();
            ans.append(num);
            ans.append('#');
            ans.append(temp);
        }
        // System.out.println(ans.toString());
        return ans.toString();
    }

    public List<String> decode(String str) {
        List<String> dfinal = new ArrayList<>();
        int i =0;
        while(i < str.length()){
            int j =0;
            StringBuilder thenum = new StringBuilder();
            while(i < str.length() && str.charAt(i) != '#'){
                thenum.append(str.charAt(i));
                i++;
            }
            j = Integer.parseInt(thenum.toString());
            if(i < str.length() && str.charAt(i) == '#'){
                int k =0;
                i++;
                StringBuilder helper = new StringBuilder();
                // System.out.println(j);
                while(i < str.length() && k < j){
                    helper.append(str.charAt(i));
                    i++;
                    k++;
                }
                // System.out.println(j);
                dfinal.add(helper.toString());

            }
        }
        return dfinal;

    }
}
