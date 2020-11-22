import org.junit.Test;
import java.util.*;

import static org.junit.Assert.assertEquals;

public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        //HandleTruth.wordCount();
    }

    @Test
    public void realTest() {
        String[] testCases = {
                "hello",
                "my name is daniel prasetyo and and thats it",
                "i live in washington you live in oregon",
                "yes yes yes yes no no no maybe",
                "java java html html c# c# javascript html",
                "extra dip dip sauce sauce sauce coding six six six six"
        };

        //test case 1
        TreeMap<Integer, Set<String>> test1 = new TreeMap<>(Collections.reverseOrder());

        Set<String> set0 = new HashSet<>(Arrays.asList("hello"));
        test1.put(1, set0);



        TreeMap<Integer, Set<String>>[] expectedCases = new TreeMap[6];
        expectedCases[0] = test1;



        for (int i = 0; i < testCases.length; i++) {
            TreeMap<Integer, Set<String>> actual = HandleTruth.wordCount(testCases[i]);
            TreeMap<Integer, Set<String>> expected = expectedCases[i];
            assertEquals(actual, expected);
        }
    }

}
}