class Solution {
    String findSum(String s1, String s2) {
        // code here
        int x=s1.length()-1;
        int y=s2.length()-1;
        int carry=0;
        
        StringBuilder result = new StringBuilder();
        while(x>=0 || y>=0 || carry!=0){
            
             int a =0;
             int b =0;
             if(x>=0){
                 a=s1.charAt(x)-'0';
             }
             if(y>=0){
                 b=s2.charAt(y)-'0';
             }
            
             
             int sum = a+b+carry;
             
            result.append(sum%10);
            carry=sum/10;
            
            x--;
            y--;
            
        }
        result=result.reverse();
        int i = 0;
        while (i < result.length() - 1 && result.charAt(i) == '0') {
    i++;
}
        return result.substring(i); 
        
    }
}