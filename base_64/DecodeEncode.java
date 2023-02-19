import java.util.Base64;

public class DecodeEncode {
  public static void main(String[] args) {
    String encoded = Base64.getEncoder().encodeToString("Bye".getBytes());
    System.out.println(encoded);

    String decoded  = new String(Base64.getDecoder().decode(encoded));
    System.out.println(decoded);
  }
}
