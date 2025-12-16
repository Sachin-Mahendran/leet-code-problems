class Solution {
    public int countDigits(int num) {
        int c=0,o=num;
        while(o!=0)
        {
            int d=o%10;
            if(d!=0&&num%d==0){
                c++;
            }
            o=o/10;


        }
        return c;
    }
}