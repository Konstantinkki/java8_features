package creating_and_useng_optionals;

import java.util.Optional;

public class CreatingOptional {
  public static void main(String[] args) {
    Optional<User> optionalUser = Optional.empty();
    System.out.println("empty optional : "+optionalUser.isPresent());

    User user = null;
    Optional<User> optionalUser1 = Optional.of(new User("Lisa"));
    System.out.println("Lisa optional : "+optionalUser1.isPresent());


    Optional<User> optionalUser2 = Optional.ofNullable (user);
    System.out.println("null optional : "+optionalUser2.isPresent());
  }
}
