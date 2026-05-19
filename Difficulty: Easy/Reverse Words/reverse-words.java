class Solution {
    public String reverseWords(String s) {
        // Code here
        char[] arr = s.toCharArray();
        int n = arr.length;
        reverse(arr , 0, n-1);
        int i=0;
        int j =0;
        while(i<n){
            while(i<n && arr[i]=='.')i++;
            if(i>=n)break;
            if(j!=0){
                arr[j]='.';
                j++;
            }
            int start =j;
            while(i<n && arr[i]!='.'){
                arr[j]=arr[i];
                i++;
                j++;
            }
            reverse(arr , start , j-1);
            
        }
        return new String(arr , 0, j);
    }
    public void reverse(char[] arr , int left , int right){
        while(left< right ){
            char temp = arr[left];
            arr[left ]=arr[right];
            arr[right]=temp;
            left++;
            right--;
            
        }
    }
}
