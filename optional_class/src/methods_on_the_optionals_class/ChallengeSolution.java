package methods_on_the_optionals_class;

import java.util.Optional;

public class ChallengeSolution {
  public static void main(String[] args) {

    //create empty Optional
    Optional<String> srtEmpty=Optional.empty();

    //create Optional containing Integer
    Optional<Integer> intOptional = Optional.of(31);

    //get value out of  empty Optional or specify a default name
    srtEmpty.orElse("Else Name");

    // filter the integer optional and only keep odd values, after that, get the value
    // or throw favorite Exception
    Optional<Integer> intOpt = Optional.of(22);
    intOpt.filter(x-> x % 2 != 0).orElseThrow(RuntimeException::new);

    // map the integer to be 1 higher and get the value out
    Integer intVal = intOpt.map(x->x+1).get();
    System.out.println("intCVal : "+intVal);



  }
}
