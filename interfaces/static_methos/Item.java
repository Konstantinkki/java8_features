package static_methos;

import default_method.Washable;

public class Item implements Foldable, Washable {
  private String name;

  public Item(String name) {
    this.name = name;
  }

  public void fold(){
    System.out.println("folding name = "+name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static void main(String[] args) {
    //Foldable.printFoldInstructions();
    Item item = new Item("Jeans");
    item.fold();
  }
}
