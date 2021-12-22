import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> strL = Arrays.asList("4.1", "abc", "glhv", "7", "2", "OPO");
        List<Integer> intL =  MapTask.mapping(strL);
        System.out.println(intL);

        List<String> words = Arrays.asList("First", "Second");
        List<String> chW = FlattingTask.flattingStrings(words);
        System.out.println(chW);

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<String> fizzBuzzWords = FizzBuzzTask.fizzBuzzIt(nums);
        System.out.println(fizzBuzzWords);

        List<String> arr = Arrays.asList("ABCA", "BCD", "ABC");
        Map<Character, Integer> res = GroupWordsTask.groupIt(arr);
        System.out.println(res);
    }
}
