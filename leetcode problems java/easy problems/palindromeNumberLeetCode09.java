
class Solution {
    public boolean isPalindrome(int x) {
        int o=x,d;
        int r=0;
        while(x>0)
        {
            d=x%10;
            r=(r*10)+d;
            x/=10;

        }
        if(r==o)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}