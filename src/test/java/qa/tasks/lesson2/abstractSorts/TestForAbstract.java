package qa.tasks.lesson2.abstractSorts;


import org.testng.Assert;
import org.testng.annotations.Test;
import qa.tasks.lesson2.abstractSort.AbstractSorts;
import qa.tasks.lesson2.abstractSort.BubbleSort;
import qa.tasks.lesson2.abstractSort.QuickSort;

public class TestForAbstract {




    @Test
    public void checkBSort(){
        int[] array = {2, 1, -2, 4, 3, 6, 0, -1, 1, 5};
        AbstractSorts sort = new BubbleSort(array);
        sort.sort();
        sort.getArray();
        int[] newArr = sort.getArray();
        Assert.assertEquals(newArr[0], -2);
        Assert.assertEquals(newArr[newArr.length-1], 6);
        Assert.assertSame(newArr[3], newArr[4]);

    }

    @Test
    public void checkQSort(){
        int[] array = {2, 1, -2, 4, 3, 6, 0, -1, 1, 5};
        AbstractSorts sort = new QuickSort(array);
        sort.sort();
        sort.getArray();
        int[] newArr = sort.getArray();
        Assert.assertEquals(newArr[0], -2);
        Assert.assertEquals(newArr[newArr.length-1], 6);
        Assert.assertSame(newArr[3], newArr[4]);

    }



}
