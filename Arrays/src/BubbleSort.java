
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        // Calling the bubble sort method
        bubbleSort(arr);

        // Displaying the sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;//7
        for (int i = 0; i < n - 1; i++) {  //6
            for (int j = 0; j < n - i - 1; j++) {//7
                if (arr[j] > arr[j + 1]) {
                    // Swap if the current element is greater than the next one
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
