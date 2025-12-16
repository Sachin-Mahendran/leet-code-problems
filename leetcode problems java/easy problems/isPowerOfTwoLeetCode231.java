import java.util.*;
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n>0&&(n&(n-1))==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
    }
}