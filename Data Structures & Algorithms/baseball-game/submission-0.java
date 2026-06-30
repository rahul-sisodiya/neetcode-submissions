class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String str : operations){
            if(str.equals("+")){
                int a = st.pop();
                int b = st.peek();
                st.push(a);
                st.push(a+b);
            }else if(str.equals("D")){
                st.push(st.peek()*2);
            }else if(str.equals("C")){
                st.pop();
            }else{
                st.push(Integer.parseInt(str));
            }
        }
        int sum = 0;
        for(int num : st){
            sum+= num;
        }
        return sum;
    }
}