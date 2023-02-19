package functional_interface;

public interface Foldable {
  static void printFoldInstructions(){
    System.out.println("Carefully fold the object");
  }
  void fold();
}
