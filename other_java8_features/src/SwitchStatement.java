public class SwitchStatement {
  public static void main(String[] args) {

    //allowed Switch statement
    //Byte Short Char Int Enum String
    String language = "Java";
    switch (language) {
      case "Java":
        System.out.println("Java");
        break;
      case "Python":
        System.out.println("Python");
        break;
      case "c#":
        System.out.println("c#");
        break;
      default:
        System.out.println("Unknown");
        break;
    }
  }
}
