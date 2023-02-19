package basic_lambda_expressions;

public class LambdaExpressions {
  public static void main(String[] args) {
    Calculator calculator = (a,b) -> a+b; // short version
    Calculator calculator1 = (double a, double b) -> {return a+b; }; // full version
  }
}
