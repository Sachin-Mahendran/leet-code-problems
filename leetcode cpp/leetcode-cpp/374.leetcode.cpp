/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

class Solution {
public:
    int guessNumber(int n) {
        int lb=0,ub=n,m,p;
        while(lb<=ub)
        {
            m=lb+(ub-lb)/2;
            p=guess(m);
            if(p==0)
            {
                return m;
            }
            else
            {
                if(p==-1)
                {
                    ub=m-1;
                }
                else
                {
                    if(p==1)
                    {
                        lb=m+1;
                    }
                }
            }
        }
        
       return 0; 
    }
};
