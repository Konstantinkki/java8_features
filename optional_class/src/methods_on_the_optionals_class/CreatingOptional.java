package methods_on_the_optionals_class;

import creating_and_useng_optionals.User;
import java.util.Optional;

public class CreatingOptional {
  public static void main(String[] args) {
    Optional<User> emptyOptional = Optional.empty();
    System.out.println("empty optional : "+emptyOptional.isPresent());


    Optional<User> userOptional = Optional.of(new User("Lisa"));
    System.out.println("Lisa optional : "+userOptional.isPresent());


    User user = null;
    Optional<User> nullOptional = Optional.ofNullable (user);
    System.out.println("null optional : "+nullOptional.isPresent());

   // System.out.println(nullOptional.get());
    System.out.println(nullOptional.orElse(new User("Maaike")));
   // System.out.println(nullOptional.orElseThrow(() -> new NullPointerException("No Value !")));
    System.out.println(userOptional.orElseThrow(() -> new NullPointerException("No Value !")));
    System.out.println(userOptional.orElseGet(() -> new User("Marina")));


    System.out.println(userOptional.filter(u->u.getName().startsWith("L")).orElse(new User("Luke")));

    Optional<Integer> integerOptional = Optional.of(30);
    System.out.println("mapped integer : "+integerOptional.map(i -> i*2).get());
  }
}
