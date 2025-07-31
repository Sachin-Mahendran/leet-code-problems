class Solution {
public:
    int climbStairs(int n) {
        int o=1;
        if(n==1)
        {
            return o;
        }
      
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
