class Solution {
public:
    bool isPalindrome(int x) {
        long int b=x,a=0,r;
        if(x<0)
        {
            return false;
        }
        while(x>0)
        {
            r=x%10;
            a=(a*10)+r;
            x=x/10;
        }
        if(a==b)
        {
            return true;
        }
            return false;
        
    }
};
