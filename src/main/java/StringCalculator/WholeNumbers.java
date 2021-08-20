package StringCalculator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class WholeNumbers {
    private final List<WholeNumber> numbers;

    public WholeNumbers(List<Integer> numbers) {
        this.numbers = numbers.stream().map(WholeNumber::new).collect(Collectors.toList());
    }

    public List<WholeNumber> getValue(){
        return numbers;
    }
}
