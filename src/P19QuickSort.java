import java.util.Scanner;

public class P19QuickSort {
    public static int partition(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        String temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void quickSort(String[] arr, int low, int high) {
        if (low < high) {
            int pivot_index = partition(arr, low, high);
            quickSort(arr, low, pivot_index - 1);
            quickSort(arr, pivot_index + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[n];
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++)
            names[i] = scanner.nextLine();

        quickSort(names, 0, n - 1);
        System.out.println("\nAfter quick sort");
        for (int i = 0; i < n; i++)
            System.out.println(names[i]);
    }
}
