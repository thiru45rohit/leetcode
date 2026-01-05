class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        else
        {
            int temp=x; //don't change original num
            int rev=0;
            while(temp>0)
            {
                int mod=temp%10;
                rev=(rev*10)+mod;
                temp/=10;
            }
            if(x==rev)
            {
                return true;
            }
            else
            {
                return false;
            }

        }
    }
}