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

        //test case 2
        TreeMap<Integer, Set<String>> test2 = new TreeMap<>(Collections.reverseOrder());

        Set<String> set1 = new HashSet<>(Arrays.asList("my", "daniel", "is", "name", "thats", "it", "prasetyo"));
        test2.put(1, set1);

        Set<String> set2 = new HashSet<>(Arrays.asList("and"));
        test2.put(2, set2);

        //test case 3
        TreeMap<Integer, Set<String>> test3 = new TreeMap<>(Collections.reverseOrder());

        Set<String> set4 = new HashSet<>(Arrays.asList("i", "washington", "you", "oregon"));
        test3.put(1, set4);

        Set<String> set3 = new HashSet<>(Arrays.asList("live", "in"));
        test3.put(2, set3);





        TreeMap<Integer, Set<String>>[] expectedCases = new TreeMap[6];
        expectedCases[0] = test1;
        expectedCases[1] = test2;
        expectedCases[2] = test3;



        for (int i = 0; i < testCases.length; i++) {
            TreeMap<Integer, Set<String>> actual = HandleTruth.wordCount(testCases[i]);
            TreeMap<Integer, Set<String>> expected = expectedCases[i];
            assertEquals(actual, expected);
        }
    }

}
}