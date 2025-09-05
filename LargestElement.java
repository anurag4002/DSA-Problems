// Q: Given an integer array, write a program in Java to find and return the largest element.
// Example: arr = {10, 25, 5, 40, 12} → Output = 40

public class LargestElement {
    public static int largest(int[] arr) {
        int largest = arr[0];  

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest; // sabse bada element return karega
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 40, 12};
        System.out.println("Largest element: " + largest(arr));
    }
}
