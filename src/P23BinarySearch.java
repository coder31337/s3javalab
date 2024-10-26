import java.util.Scanner;

public class P23BinarySearch {
    static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        System.out.print("Enter the sorted elements: ");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++)
            numbers[i] = scanner.nextInt();
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        int targetIndex = binarySearch(numbers, target);
        if (targetIndex == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + targetIndex);
    }
}
