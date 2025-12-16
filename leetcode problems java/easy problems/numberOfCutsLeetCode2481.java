class Solution {
    public int numberOfCuts(int n) {
        int s=0;
        if(n>1)
        {
            if(n%2==0)
            {
                return n/2;
            }
            else
            {
                return n;
            }
        }
        else
        {
            return s;
        }

    }
}