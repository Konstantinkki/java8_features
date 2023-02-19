package functional_interface;

public class Item implements Foldable, Washable {
  public static void main(String[] args) {
    Foldable.printFoldInstructions();
  }

  public void fold() {
    Washable.super.fold();
  }

  public void wash() {
    System.out.println("washing item");
  }

}
