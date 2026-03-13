class Solution {
    public ArrayList<String> generateIp(String s) {
        // code here
        // in book 
        ArrayList<String> res = new ArrayList<>();
        backtrack(s , 0,0,"" ,res);
        return res;
    }
    void backtrack(String s , int index , int parts , String curr , ArrayList<String> res){
        if(parts == 4  && index ==s.length()){
            res.add(curr.substring(0, curr.length()-1));
            return ;
        } 
        if(parts==4 || index==s.length())return ;
        for(int len =1; len<=3 && index+len<=s.length(); len++){
            String segment =s.substring(index , index+len);
            if((segment.length()>1 && segment.charAt(0)=='0') || Integer.parseInt(segment)>255)continue;
            backtrack(s, index+len , parts+1, curr+segment+".", res);
        }
    }
}