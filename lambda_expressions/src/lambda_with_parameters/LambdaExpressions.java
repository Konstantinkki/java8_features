package lambda_with_parameters;

import basic_lambda_expressions.Calculator;

public class LambdaExpressions {

  public static void main(String[] args) {
    Calculator calculator = (a, b) -> a+b; // short version
    Calculator calculator1 = (double a, double b) -> {return a+b; }; // full version

    Creator creator = () -> "Hello there";
    System.out.println( creator.create());

    Tester tester = (str)-> str.length() > 5;

    System.out.println(tester.test("sdsdsfs"));
  }


}
