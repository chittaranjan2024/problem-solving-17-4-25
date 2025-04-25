public class FirstOccurrence {
    public static int firstOccurrence(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                result = mid;
                high = mid - 1; // Look left for earlier occurrence
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 4, 5, 6};
        int x = 4;
        int index = firstOccurrence(arr, x);
        System.out.println("First occurrence of " + x + " is at index: " + index);
    }
}

