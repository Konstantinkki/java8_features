package lambda_expressions_body;

import basic_lambda_expressions.Calculator;

public class LambdaExpressions {

  public static void main(String[] args) {
    Calculator calculator = (a, b) -> a+b; // short version
    Calculator calculator1 = (double a, double b) -> {return a+b; }; // full version

    Creator creator = () -> "Hello there";
    System.out.println( creator.create());

    Tester tester = (str)-> str.length() > 5;

    //Multi Line expression
    Tester tester1 = (str) -> {
      String s = str.substring(0, str.length() - 2);
      if(s.length() == str.length()){
        return true;
      }else{
        return false;
      }
    };



    System.out.println(tester.test("sdsdsfs"));
  }


}
