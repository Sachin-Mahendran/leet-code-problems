class Solution {
    public int subtractProductAndSum(int n) {
        int s=0,p=1;
        while(n!=0)
        {
            int d=n%10;
            p=p*d;
            s=s+d;
            n=n/10;

        }
        return p-s;
    }
}