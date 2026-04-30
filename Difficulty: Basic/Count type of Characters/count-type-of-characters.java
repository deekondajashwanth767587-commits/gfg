// User function Template for Java

class Sol {
    int[] count(String s) {
        // your code here
        int upperchar=0;
        int lowerchar=0;
        int number=0;
        int specialchar=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='A' && ch<='Z')upperchar++;
            else if(ch>='a' && ch<='z')lowerchar++;
            else if(ch>='0' && ch<='9')number++;
            else specialchar++;
        }
        int[] result = {upperchar , lowerchar , number , specialchar};
        return result;
    }
}