import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class ArrayListUtilitiesTest {
    @Test
    public void testGetListMax() {
        ArrayList<Integer> input;
        int expectedOutput;
        int actualOutput;

        // some positive numbers
        input = new ArrayList<>(Arrays.asList(1, 5, 4, 9, 2, 1));
        expectedOutput = 9;
        actualOutput = ArrayListUtilities.getListMax(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testWithoutLongWords() {
        ArrayList<String> input;
        ArrayList<String> expectedOutput;
        ArrayList<String> actualOutput;

        // some positive numbers
        input = new ArrayList<>(Arrays.asList("Charles", "Apple", "cat","some","LongWord"));
        expectedOutput = new ArrayList<>(Arrays.asList("Apple", "cat", "some"));
        actualOutput = ArrayListUtilities.withoutLongWords(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testRemoveLongWords() {
        ArrayList<String> input;
        ArrayList<String> expectedOutput;
        ArrayList<String> actualOutput;

        // some positive numbers
        input = new ArrayList<>(Arrays.asList("Charles", "Apple", "cat","some","LongWord"));
        expectedOutput = new ArrayList<>(Arrays.asList("Apple", "cat", "some"));
        actualOutput = ArrayListUtilities.withoutLongWords(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testReversed() {
        ArrayList<Double> input;
        ArrayList<Double> expectedOutput;
        ArrayList<Double> actualOutput;

        // some positive numbers
        input = new ArrayList<>(Arrays.asList(5.7,2.4,1.1,9.3,8.3));
        expectedOutput = new ArrayList<>(Arrays.asList(8.3,9.3,1.1,2.4,5.7));
        actualOutput = ArrayListUtilities.reversed(input);
        assertEquals(expectedOutput, actualOutput);
    }

}
