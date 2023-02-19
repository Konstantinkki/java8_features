package lambda_expressions_and_variables;

import basic_lambda_expressions.Calculator;

public class LambdaAndScope {
  public static void main(String[] args) {

    int c=10;
   // c=25; // error because c is not effectively final
    Calculator calculator = (a,b) -> c+a;  // c - effectively final

    System.out.println();
  }
}
