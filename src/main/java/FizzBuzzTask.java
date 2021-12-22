import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzzTask {
    public static List<String> fizzBuzzIt(List<Integer> input) {
        return input.stream().map(FizzBuzzTask::mapper).collect(Collectors.toList());
    }
    public static String mapper(int input) {
        if (input % 3 == 0) {
            return "Fizz";
        }
        else if (input % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(input);

    }
}
