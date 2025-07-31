class Solution {
public:
    int climbStairs(int n) {
      
        int fs=1;
        int ss=2;
        int mf;
        for(int i=3;i<=n;i++)
        {
            mf=fs+ss;
            fs=ss;
            ss=mf;
        }
        return ss;   
    }
};
