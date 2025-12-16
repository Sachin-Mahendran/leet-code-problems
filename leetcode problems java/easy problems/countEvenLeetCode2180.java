class Solution {
    public int countEven(int num) {
        int c=0;
       for(int i=1;i<=num;i++)
       {
        int s=0;
        int t=i;
        while(t!=0)
        {
            s=s+(t%10);
            t=t/10;

        }
        if(s%2==0)
        {
            c++;
        }
       }
       return c;
}}