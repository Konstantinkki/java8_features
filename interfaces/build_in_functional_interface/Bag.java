package build_in_functional_interface;

public class Bag implements Foldable, Washable {
  public void wash() {
    System.out.println("washing item");
  }

  public void fold() {

  }
}
