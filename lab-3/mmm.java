import java.util.*;

public class mmm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        while (true) {
            System.out.println("\nSelect an option:\n1. Mean Value\n2. Median Value\n3. Mode Value\n4. Exit");
            int option = input.nextInt();
            if (option == 1) {
                double mean = findMean(arr);
                System.out.printf("Mean Value: %.2f\n", mean);
            } else if (option == 2) {
                double median = findMedian(arr);
                System.out.printf("Median Value: %.2f\n", median);
            } else if (option == 3) {
                int mode = findMode(arr);
                System.out.printf("Mode Value: %d\n", mode);
            } else if (option == 4) {
                break;
            } else {
                System.out.println("Invalid option!");
            }
        }
    }

    public static double findMean(int[] arr) {
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static double findMedian(int[] arr) {
        Arrays.sort(arr);
        if (arr.length % 2 == 0) {
            int middle = arr.length / 2;
            double median = (arr[middle - 1] + arr[middle]) / 2.0;
            return median;
        } else {
            int middle = arr.length / 2;
            return arr[middle];
        }
    }

    public static int findMode(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (frequencyMap.containsKey(arr[i])) {
                frequencyMap.put(arr[i], frequencyMap.get(arr[i]) + 1);
            } else {
                frequencyMap.put(arr[i], 1);
            }
        }
        int mode = 0;
        int maxFrequency = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mode = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }
        return mode;
    }
}

