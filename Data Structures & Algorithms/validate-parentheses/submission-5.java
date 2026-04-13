class Solution {
    public boolean isValid(String s) {
        Stack<Character> helper = new Stack<>();
        for(int i =0; i < s.length();i++){
            char temp = s.charAt(i);
            if(temp == ']' ||temp == '}'||temp == ')'){
                if(helper.isEmpty()){
                    return false;
                }
            }
            if(temp == '(' ||temp == '{'||temp == '['){
                helper.push(temp);
            }else if(temp == ')' && !helper.isEmpty() && helper.pop() != '('){
                return false;
            }else if(temp == '}' && !helper.isEmpty() && helper.pop() != '{'){
                return false;
            }else if(temp == ']' && !helper.isEmpty() && helper.pop() != '['){
                return false;
            }
        }
        if(!helper.isEmpty()){
            return false;
        }
        return true;
    }
}
