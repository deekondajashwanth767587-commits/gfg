/*Complete the function below.
Node is as follows:
class Tree
{
      int data;
      Tree left,right;
      Tree(int d){
          data=d;
          left=null;
          right=null;
}
}*/
class Solution {
    public  int treePathsSum(Node root) {
        // add code here.
        return solve(root , 0);
    }
    public int solve(Node node , int current){
        if(node==null)return 0;
        current =current*10+node.data;
        if(node.left== null && node.right==null)return current;
        int leftsum=solve(node.left , current);
        int rightsum = solve(node.right, current);
        return leftsum+rightsum;
    }
}