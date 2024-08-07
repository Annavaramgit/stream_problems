package streams.practice.series1;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2,1, 3, 1, 1, 4, 5, 4, 5, 10,2,3};
        int len = arr.length;

        int[] temp = new int[len];
        int p = 0;
        boolean isDuplicate;

        for (int i = 0; i < len; i++) {
            isDuplicate = false;
            // Check if arr[i] is a duplicate
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            // If not a duplicate, add to temp
            if (!isDuplicate) {
                temp[p++] = arr[i];
            }
        }

        // Print the unique values
        for (int t = 0; t < p; t++) {
            System.out.println(temp[t]);
        }
    }
}
