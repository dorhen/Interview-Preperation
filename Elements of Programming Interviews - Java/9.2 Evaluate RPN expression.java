int RPNEvaluate(String RPN){
    char delimeter = ',';
    Stack<Integer> s = new Stack<>();
    String toAdd;
    while(RPN.indexOf(delimeter) != -1) {
        toAdd = RPN.substring(0, RPN.indexOf(delimeter));
        RPN = RPN.substring(RPN.indexOf(delimeter)+1, RPN.length());
        s.push(toAdd);
    }
    s.push(RPN);
    int res1,res2;
    while(1){
        res1 = Integer.parseInt(s.pop());
        if(s.isEmpty()) return res1;
        res2 = Integer.parseInt(s.pop());
        String sign = s.pop();
        if(sign == "+")
            s.push(res1+res2);
        else if(sign == "X")
            s.push(res1*res2);
        else if(sign == "-")
            s.push(res1 - res2);
        else if(sign == "/")
            s.push(res1/res2);
    }
    return 0;
}
