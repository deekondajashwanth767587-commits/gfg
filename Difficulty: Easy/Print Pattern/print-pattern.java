class Solution {
    public ArrayList<Integer> pattern(int n) {
        // code here
       
        ArrayList<Integer> result = new ArrayList<>();
        
          if(n<=0){
              result.add(n);
              return result;
          } 
          int x = n;
          int last=gettillzero(result ,x );
          gettilln(result , last, n);
          return result;
    }
    public int gettillzero( ArrayList<Integer> result , int x){
        if(x<=0){
             result.add(x);
            return x;
        }
         result.add(x);
         x-=5;
         return  gettillzero(result ,x );
    }
    public void gettilln( ArrayList<Integer> result , int x , int target){
        if(x==target)return;
        x+=5;
        result.add(x);
         gettilln(result , x, target);
    }
}