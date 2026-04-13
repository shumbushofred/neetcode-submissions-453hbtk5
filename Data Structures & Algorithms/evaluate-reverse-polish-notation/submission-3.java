class Solution {
    public int evalRPN(String[] tokens) {
     Stack<Integer> thehelper = new Stack<Integer>();
     int num1 =0;
     int num2=0;
     int re = 0;
    for(String i: tokens){
        System.out.println(thehelper);
        if (i.charAt(0) == '+'){
            num1 = thehelper.pop();
             num2 = thehelper.pop();
            re = num1 + num2;
            thehelper.push(re);

        }else if (i.length() == 1 && i.charAt(0) == '-'){
             num1 = thehelper.pop();
             num2 = thehelper.pop();
            re = num2 - num1;
            thehelper.push(re);
        }else if (i.charAt(0) == '*'){
              num1 = thehelper.pop();
             num2 = thehelper.pop();
            re = num2 * num1;
            thehelper.push(re);
        }else if (i.charAt(0) == '/'){
              num1 = thehelper.pop();
             num2 = thehelper.pop();
            re = num2 / num1;
            thehelper.push(re);
        }else{
             int temp = Integer.parseInt(i);
            thehelper.push(temp);
        }
    }
    return thehelper.pop();
    }
}
