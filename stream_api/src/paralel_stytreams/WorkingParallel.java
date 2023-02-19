package paralel_stytreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WorkingParallel {
  public static void main(String[] args) {
    //different outcome with parallel stream
    int total = Stream.of(1,2,3,4,5,6,7,8,9,10)
        .parallel()
        .reduce(1, (x,y)-> x+y);
        System.out.println("total : "+total);

        // performance test
    String[] names = {"Adnane", "Mary", "Laila", "Dennis", "Nitin", "Sairam", "Maaike"};
    List<String> nameList = new ArrayList<>(Arrays.asList(names));

    long startParallel = System.currentTimeMillis();
    nameList.parallelStream()
        .filter(s-> s.startsWith("M"))
        .forEach(s-> System.out.println(s));
    long endParallel = System.currentTimeMillis();
    System.out.println("Parallel took " + (endParallel - startParallel));

    startParallel = System.currentTimeMillis();
    nameList.stream()
        .filter(s-> s.startsWith("M"))
        .forEach(s-> System.out.println(s));
    endParallel = System.currentTimeMillis();
    System.out.println("Sequential took " + (endParallel - startParallel));

  }
}
