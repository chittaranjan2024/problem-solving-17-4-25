
public class CountOccurrences {

    // Function to find the first occurrence of x
    static int firstOccurrence(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                result = mid;
                high = mid - 1; // keep searching in the left half
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    // Function to find the last occurrence of x
    static int lastOccurrence(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                result = mid;
                low = mid + 1; // keep searching in the right half
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    // Main function to count occurrences
    static int countOccurrences(int[] arr, int x) {
        int first = firstOccurrence(arr, x);
        if (first == -1) return 0; // x not found
        int last = lastOccurrence(arr, x);
        return (last - first + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int x = 5;
        System.out.println("Count of " + x + " is: " + countOccurrences(arr, x));
    }
}

