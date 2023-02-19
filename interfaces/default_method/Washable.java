package default_method;

public interface Washable {
  default void fold(){
    System.out.println("Folding the object Washable");
  }
}
