import java.util.Arrays;

// DSA Activity: Bubble Sort and Binary Search
public class SortAndSearch
{
    // Sorts the array in ascending order using bubble sort
    static void bubbleSort(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;   // already sorted
        }
    }

    // Returns the index of target in a sorted array, or -1 if not found
    static int binarySearch(int[] arr, int target)
    {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original: " + Arrays.toString(numbers));

        bubbleSort(numbers);
        System.out.println("Sorted  : " + Arrays.toString(numbers));

        int target = 25;
        int index = binarySearch(numbers, target);
        System.out.println(index >= 0
                ? target + " found at index " + index
                : target + " not found");
    }
}
