class Solution {
    public int reverseBits(int n) {
        int[] arr = new int[32];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=0;
        }
        int temp=n;
        int ti=0;
        while(temp>0)
        {
            int mod=temp%2;
            arr[ti++]=mod;
            temp/=2;
        }
        int num=0;
        int p=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]==1)
            {
                num+=Math.pow(2,p);
            }
            p++;
        }
        return num;
    }
}