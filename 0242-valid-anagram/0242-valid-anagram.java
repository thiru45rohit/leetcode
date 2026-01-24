class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        int[] f1 = new int[256];
        int[] f2 = new int[256];
        for(int i=0;i<s.length();i++)
        {
            f1[s.charAt(i)]++;
        }
        for(int i=0;i<t.length();i++)
        {
            f2[t.charAt(i)]++;
        }
        for(int i=0;i<256;i++)
        {
            if(f1[i]!=f2[i])
            {
                return false;
            }
        }
        return true;
    }
}