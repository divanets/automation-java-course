package qa.tasks.lesson2.boobleSort;

public class BubbleSort {
    public static void main(String[] args) {

        System.out.println("Array before sorting: ");
        int[] array = {2, 1, -2, 4, 3, 6, 0, -1, 1, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        System.out.println("Array sorted by Ascending: ");
        for (int i = array.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }

        System.out.println();
        System.out.println("Array sorted by Descending: ");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + "  ");
        }

/*        System.out.println();
        System.out.println("Array sorted by Descending: ");
        for (int k = array.length - 1; k >0 ; k--) {
            for (int m = 0; m < k; m++) {
                if (array[m] < array[m + 1]) {
                    int tmp1 = array[m];
                    array[m] = array[m+1];
                    array[m+1] = tmp1;
                }
            }
        }

        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + "  ");
        }*/
    }
}
