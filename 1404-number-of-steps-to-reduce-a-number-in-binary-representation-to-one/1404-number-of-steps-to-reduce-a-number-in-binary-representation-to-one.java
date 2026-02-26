import java.math.*;
class Solution {
    public int numSteps(String s) {
        BigInteger n = new BigInteger(s,2);
        
        int ct=0;
        while(!n.equals(BigInteger.ONE))
        {
        if(n.mod(BigInteger.TWO).equals(BigInteger.ZERO))
        {
            n=n;
        }
        else
        {
            ct++;
            n=n.add(BigInteger.ONE);
        }
            n=n.divide(BigInteger.TWO);
            ct++;
        }
        return ct;
    }
}