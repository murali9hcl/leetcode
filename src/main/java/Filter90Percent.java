

import java.util.List;
import java.util.stream.Collectors;

public class Filter90Percent {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> filteredList = numbers.stream()
                .filter(element -> Math.random() < 0.9)  // Keep only 90% of the elements
                .collect(Collectors.toList());

        System.out.println("Original List: " + numbers);
        System.out.println("Filtered List (90%): " + filteredList);
    }
}
