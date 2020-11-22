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

        //test case 4
        TreeMap<Integer, Set<String>> test4 = new TreeMap<>(Collections.reverseOrder());

        Set<String> set5 = new HashSet<>(Arrays.asList("yes"));
        test4.put(4, set5);

        Set<String> set6 = new HashSet<>(Arrays.asList("maybe"));
        test4.put(1, set6);

        Set<String> set7 = new HashSet<>(Arrays.asList("no"));
        test4.put(3, set7);

        //test case 5
        TreeMap<Integer, Set<String>> test5 = new TreeMap<>(Collections.reverseOrder());

        Set<String> set8 = new HashSet<>(Arrays.asList("html"));
        test5.put(3, set8);

        Set<String> set9 = new HashSet<>(Arrays.asList("java", "c#"));
        test5.put(2, set9);

        Set<String> set10 = new HashSet<>(Arrays.asList("javascript"));
        test5.put(1, set10);

        //test case 6
        TreeMap<Integer, Set<String>> test6 = new TreeMap<>(Collections.reverseOrder());

        Set<String> set11 = new HashSet<>(Arrays.asList("extra", "coding"));
        test6.put(1, set11);

        Set<String> set12 = new HashSet<>(Arrays.asList("sauce"));
        test6.put(3, set12);

        Set<String> set13 = new HashSet<>(Arrays.asList("dip"));
        test6.put(2, set13);

        Set<String> set14 = new HashSet<>(Arrays.asList("six"));
        test6.put(4, set14);

        // set the expected cases to each test case
        TreeMap<Integer, Set<String>>[] expectedCases = new TreeMap[6];
        expectedCases[0] = test1;
        expectedCases[1] = test2;
        expectedCases[2] = test3;
        expectedCases[3] = test4;
        expectedCases[4] = test5;
        expectedCases[5] = test6;

        for (int i = 0; i < testCases.length; i++) {
            TreeMap<Integer, Set<String>> actual = HandleTruth.wordCount(testCases[i]);
            TreeMap<Integer, Set<String>> expected = expectedCases[i];
            assertEquals(actual, expected);
        }
    }

}
