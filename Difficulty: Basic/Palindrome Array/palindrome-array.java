
class Solution {
    public static boolean isPerfect(int[] arr) {
        // code here
        for(int i=0;i<=arr.length/2;i++)
        {
            if(arr[i] != arr[arr.length-1-i])
            {
                return false;
            }
        }
        return true;
    }
}
