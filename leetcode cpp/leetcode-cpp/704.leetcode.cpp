class Solution {
public:
    int search(vector<int>& nums, int target) {
        int lb=0,ub=nums.size()-1,m;
        while(lb<=ub)
        {
            m=lb+(ub-lb)/2;
            if(nums[m]==target)
            {
                return m;
            }
            else
            {
                if(nums[m]>target)
                {
                    ub=m-1;
                }
                else{
                    if(nums[m]<target)
                    {
                        lb=m+1;
                    }
                }
        
            }
        }
        return -1;
        
    }
};
