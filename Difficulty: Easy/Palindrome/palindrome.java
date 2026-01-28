class Solution {
    public boolean isPalindrome(int n) {
        
        int temp = n;
        int rev=0, rem;
        
        while(temp != 0)
        {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        
    if(n == rev)
    {
        return true;
    }
    else {
        return false;
    }
    }
}