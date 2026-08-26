class Solution {
    public String profession(int level, int pos) {
        // code here
        int count =0;
        int n =pos-1;
        while(n!=0){
            n = n&(n-1);
            count++;
        }
        return (count%2==0)?"Engineer":"Doctor";
    }
}