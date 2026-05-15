class Solution {
    int then;
    List<String> theans;
    public List<String> generateParenthesis(int n) {
        then = n;
        theans = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        helper(0,0,str);
        return theans;
    }
    public void helper(int theo, int thec, StringBuilder str){
        if(theo == then && thec == then){
        theans.add(str.toString());
        return;
        }
        if(theo < then){
            str.append('(');
            helper(theo+1,thec,str);
            str.deleteCharAt(str.length() - 1);
        }
         if(thec < theo){
            str.append(')');
            helper(theo,thec+1,str);
            str.deleteCharAt(str.length() - 1);
        }
    }
}
