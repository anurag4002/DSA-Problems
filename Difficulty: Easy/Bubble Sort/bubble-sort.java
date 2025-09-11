class Solution {
    public void bubbleSort(int[] arr) {
        // code here
        for(int turn=0;turn<arr.length-1; turn++)
        {
            for(int j=0; j<arr.length-turn-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
    }
}