class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> thes = new Stack<>();
        int the1 = 0;
        int the2 = 0;
        for(String i: tokens){
            if(isint(i)){
                thes.push(Integer.parseInt(i));
            }else if(i.equals("+")){
                the1 = thes.pop();
                the2 = thes.pop();
                thes.push(the2 + the1);
            }else if(i.equals("-")){
                the1 = thes.pop();
                the2 = thes.pop();
                thes.push(the2 - the1);
            }else if(i.equals("*")){
                the1 = thes.pop();
                the2 = thes.pop();
                thes.push(the2 * the1); 
            }else if(i.equals("/")){
                the1 = thes.pop();
                the2 = thes.pop();
                thes.push(the2 / the1);
            }
        }
        return thes.pop();
    }
    public Boolean isint(String i){
        try{
         Integer.parseInt(i);
         return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
}
