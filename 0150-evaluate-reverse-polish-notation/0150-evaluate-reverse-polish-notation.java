class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
       for(String str : tokens){ 
           if(str.equals("+")){
               s.push(s.pop()+s.pop());     
           }else if(str.equals("-")){
               int a = s.pop(), b = s.pop();
               s.push(b-a);  
           }else if(str.equals("*")){
               int a = s.pop(), b = s.pop();
               s.push(b*a);
               
           }else if(str.equals("/")){
               int a = s.pop(),b = s.pop();
               s.push(b/a); 
           }else{
                s.push(Integer.parseInt(str));
            }
       }
        return s.pop();
    }
}