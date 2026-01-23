class Solution {
    public int hammingWeight(int n) {
        int[] arr = new int[10000];
        int in=0;
        while(n>0)
        {
            int v = n%2;
            arr[in++]=v;
            n/=2;
        }
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                sum++;
            }
        }
        return sum;
    }
}