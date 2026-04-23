class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int j=0,i=0;
        int n=a.length;
        int m = b.length;
         while(i<n && j<m){
             if(i>0 && a[i]==a[i-1]){
                 i++;
                 continue;
             }
             if(j>0 && b[j]==b[j-1]){
                 j++;
                 continue;
             }
             if(a[i]<b[j]){
                 result.add(a[i]);
                 i++;

             }else if(a[i]>b[j]){
                 
                 
                 result.add(b[j]);
                 j++;
             }else{
                 result.add(a[i]);
                 i++;
                 j++;
             }
         }
         while(j<m){
             if(j ==0 || b[j]!=b[j-1]){
                 result.add(b[j]);
                 
             }
             j++;
         }
         while(i<n){
             if(i==0 || a[i]!=a[i-1]){
                 result.add(a[i]);
             }
             i++;
         }
        
        
        
        
        
        
        return result;
    }
}
