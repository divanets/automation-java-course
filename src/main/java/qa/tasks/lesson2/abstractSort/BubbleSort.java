package qa.tasks.lesson2.abstractSort;

public class BubbleSort extends AbstractSorts {
    public BubbleSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}
