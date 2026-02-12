class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        int in=0;
        for(int i=0;i<=n;i++)
        {
            int sum=0;
            int num=i;
            while(num>0)
            {
                int mod=num%2;
                if(mod==1)
                {
                    sum+=1;
                }
                num/=2;
            }
            arr[in++]=sum;
        }
        return arr;
    }
}