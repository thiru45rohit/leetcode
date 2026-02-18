class Solution {
    public boolean hasAlternatingBits(int n) {
        int temp=n;
        int arr[] = new int[10001];
        int in=0;
        while(temp>0)
        {
            int mod=temp%2;
            arr[in++]=mod;
            temp/=2;
        }
        for(int i=0;i<in-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                return false;
            }
        }
        return true;
    }
}