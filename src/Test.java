import java.util.Arrays;
import java.util.List;

public class Test {
    // Java code for Stream.min() method to get
// the minimum element of the Stream
// according to the provided Comparator.


    public static void main(String[] args) {

        // Creating a list of integers
        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);

        // Using stream.min() to get minimum
        // element according to provided Integer Comparator
        Integer var =
                list.stream()
                        .max(Integer::compareTo)
                        .get();

        System.out.print(var);
    }
}


