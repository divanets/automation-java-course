package qa.tasks.lesson2.abstractSort;

public class MainClass {

    public static void main(String[] args) {
        int[] array = {2, 1, -2, 4, 3, 6, 0, -1, 1, 5};
        System.out.println("=====================================");
        System.out.println("          BubbleSorting");
        System.out.println("=====================================");
        AbstractSorts.printArray(array, "before");
        BubbleSort bubbleSort = new BubbleSort(array);
        bubbleSort.sort();
        AbstractSorts.sortByAscending(array);
        AbstractSorts.sortByDescending(array);
        System.out.println();

        System.out.println("=====================================");
        System.out.println("          QuickSorting");
        System.out.println("=====================================");
        int arr[] = {10, 7, 8, 9, 1, 5, -2, 4, 3, 6};
        AbstractSorts.printArray(arr, "before");
        QuickSort quickSort = new QuickSort(arr);
        quickSort.sort();
        AbstractSorts.printArray(arr, "after");

    }
}
