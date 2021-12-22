import java.util.*;
import java.util.stream.Collectors;

public class GroupWordsTask {
    public static Map<Character, Integer> groupIt(List<String> input) {
        return input
                .stream()
                .collect(Collectors.groupingBy(x -> x.charAt(0), HashMap::new, Collectors.toList()))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> Collections.frequency( entry.getValue().stream()
                                .flatMap(str -> Arrays.stream(str.split("")))
                                .collect(Collectors.toList()), entry.getKey().toString() )));
    }
}
