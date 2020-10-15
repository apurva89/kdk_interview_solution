import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        try {
            Integer array[] = {7, 15, 3, 0, 10, 19, 14};
            Stream<Integer> arrStream = Stream.of(array);
            arrStream.sorted().sorted((x, y) -> x.bitCount(x) - x.bitCount(y))
                    .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                        Collections.reverse(list);
                        return list;
                    }))
                    .forEach(System.out::println);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
