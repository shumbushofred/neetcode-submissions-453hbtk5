class Solution {
    List<String> thel;
    int then;
    public List<String> generateParenthesis(int n) {
        then = n;
        thel = new ArrayList<>();
        StringBuilder bb = new StringBuilder();
        helper(0,0,bb);
        return thel;
    }
    public void helper(int theo,int thec,StringBuilder bb){
        if(theo == thec && theo == then){
            thel.add(bb.toString());
            return;
        }

        if(theo < then){
            bb.append("(");
            helper(theo + 1,thec,bb);
            bb.deleteCharAt(bb.length()-1);
        }

        if(thec < theo){
            bb.append(")");
            helper(theo,thec + 1,bb);
            bb.deleteCharAt(bb.length()-1);
        }
    }
}
