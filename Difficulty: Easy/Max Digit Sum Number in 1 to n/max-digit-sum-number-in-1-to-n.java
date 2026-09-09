class Solution {
    public int findMax(int n) {
        // code here
        int bestnum=n;
        int bestsum= digitsum(n);
        String s = Integer.toString(n);
        String pre="";
        for(int i=0;i<s.length();i++){
             
            int x=(s.charAt(i)-'0')-1;
            if(x<0){
                pre+=s.charAt(i);
                continue;
                
            }
             
                String digit = pre;
                String middle = Integer.toString(x);
                for(int j=i+1;j<s.length();j++){
                    middle+='9';
                }
                digit+=middle;
                int newnum  = Integer.parseInt(digit);
                int newsum  = digitsum(newnum);
                
                if(newsum>bestsum){
                    bestsum = newsum;
                    bestnum = newnum;
                }else if(newsum == bestsum){
                    bestnum= Math.max(bestnum , newnum);
                }
                pre+=s.charAt(i);
            

        }
        
     return bestnum;   
    }
    public int digitsum(int x){
        int sum =0;
        while(x>0){
            int digit=x%10;
            x=x/10;
            sum+=digit;
        }
        
        return sum;
    }
    
}
