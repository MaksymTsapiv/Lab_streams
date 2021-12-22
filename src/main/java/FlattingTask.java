import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattingTask {
    public static List<String> flattingStrings(List<String> input){
        return input.stream().flatMap(str -> Arrays.stream(str.split(""))).collect(Collectors.toList());
    }
}
