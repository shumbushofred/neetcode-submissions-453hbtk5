class Solution {
    public boolean isValid(String s) {
       
        Stack<Character> thes = new Stack<>();
        for(char i: s.toCharArray()){
            if(i == '(' || i == '{'||i == '['){
                thes.push(i);
            }
          
            if(i == ')'){
            if (thes.isEmpty() || thes.pop() != '(' ){
                return false;
            }
            }
            if(i == '}'){
            if (thes.isEmpty() || thes.pop() != '{' ){
                return false;
            }
            }
            if(i == ']'){
            if (thes.isEmpty() || thes.pop() != '[' ){
                return false;
            }
            }
            
        }
        if(!thes.isEmpty()){
            return false;
        }
        return true;
    }
}
