package qa.tasks.lesson2.abstractSort;


public abstract class AbstractSorts {
    public abstract void sort();

    final int[] array;
    int[] result;

    public AbstractSorts(int[] array) {
        this.array = array;
    }

    public static void printArray(int[] array, String text) {
        System.out.println("Array " + text + " sorting: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }

    public static void sortByAscending(int[] array) {
        System.out.println("Array sorted by Ascending: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }

    public static void sortByDescending(int[] array) {
        System.out.println("Array sorted by Descending: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }

    public int[] getResult() {
        return result;
    }

}
