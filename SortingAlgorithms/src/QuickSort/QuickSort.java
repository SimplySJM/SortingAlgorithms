package QuickSort;

public class QuickSort {

    public void sort(int[] arr, int min, int max) {
        int i = min;
        int j = max;
        int pivot = arr[(min + max) / 2];

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }

            if (min < j) {
                sort(arr, min, j);
            }

            if (i < max) {
                sort(arr, i, max);
            }
        }
    }
}
