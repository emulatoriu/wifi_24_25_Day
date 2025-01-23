package start15_customerNames;

import java.util.List;
import java.util.HashMap;
import java.util.stream.Collectors;

public class CustomerNameService {
    public HashMap<String, Long> countNames(List<String> names) {
        return (HashMap<String, Long>) names.stream()
                .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));
    }
}
