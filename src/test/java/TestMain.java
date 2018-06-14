import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestMain {

    @Test
    public void testMissingElements() {

        //Given
        Integer[] inputArray = new Integer[]{3, 9, 2, 11};
        Integer[] inputArrayWithOccurences = new Integer[]{3, 3, 3, 5};
        Integer[] inputArrayWith = new Integer[]{1, 2, 3, 4};

        //When
        int[] outputArray = Main.findMissing(inputArray);
        int[] outputArrayWithMissingOccurences = Main.findMissing(inputArrayWithOccurences);
        int[] outputArrayWith = Main.findMissing(inputArrayWith);

        //Then
        Assert.assertArrayEquals(new int[]{4, 5, 6, 7, 8, 10}, outputArray);
        Assert.assertArrayEquals(new int[]{4}, outputArrayWithMissingOccurences);
        Assert.assertArrayEquals(new int[]{}, outputArrayWith);

    }

    @Test
    public void testCounter() {

        //Given
        Integer[] inputArray = new Integer[]{3, 9, 2, 11};

        //When
        int uniqueIds = Main.counter(inputArray);


        //Then
        Assert.assertEquals(4, uniqueIds);

    }

    @Test
    public void testCounterForMonth() {

        //Given

        //Contains 6 different users
        Integer[] usersDay1 = new Integer[]{1, 6};
        Integer[] usersDay2 = new Integer[]{2, 5};
        Integer[] usersDay3 = new Integer[]{3, 1};
        Integer[] usersDay4 = new Integer[]{4, 2};
        Integer[] usersDay5 = new Integer[]{};


        List<Integer[]> inputList = Arrays.asList(usersDay1, usersDay2, usersDay3, usersDay4, usersDay5);


        //When
        int uniqueIds = Main.countUniqueUsers(inputList);

        //Then
        Assert.assertEquals(6, uniqueIds);


    }
}
