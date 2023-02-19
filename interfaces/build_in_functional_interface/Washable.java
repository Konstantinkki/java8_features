package build_in_functional_interface;

@FunctionalInterface
public interface Washable {
  default void fold(){
    System.out.println("Folding the object Washable");
  }

  void wash();

}
