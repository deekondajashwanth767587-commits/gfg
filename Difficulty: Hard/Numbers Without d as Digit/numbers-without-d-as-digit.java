class Solution {
    public int countWithout(int n, int d) {
        // code here
      if(n<=0)return 0;
      String s = String.valueOf(n);
      int length = s.length();
      int[][] dp = new int[2][2];
      
      for(int tight =0; tight<2 ;tight++){
          for(int start =0;start<2 ;start++){
              dp[tight][start]=start;
          }
      }
      for(int pos=length-1 ;pos>=0;pos--){
          int[][] newdp = new int[2][2];
          int currentdigit = s.charAt(pos)-'0';
          for(int tight =0;tight<2;tight++){
              for(int start =0;start<2 ;start++){
                  int limit = (tight==1)?currentdigit:9;
                  int total =0;
                  for(int digit=0;digit<=limit ; digit++){
                      int newstart = (start==1 || digit!=0)?1:0;
                      if(newstart==1 && digit==d){
                          continue;
                      }
                      int newtight =(tight==1 && digit==currentdigit)?1:0;
                      total+=dp[newtight][newstart];
                  }
                  newdp[tight][start]=total;
              }
          }
          dp = newdp;
          
      }
      return dp[1][0];
      
      
      
    }
}