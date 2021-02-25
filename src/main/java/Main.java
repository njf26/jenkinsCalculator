public class Main {

  public static void main(String args[]) {

    Calculator calc = new Calculator();
    if ("add".equals(args[0])) {
      System.out.println(calc.add(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
    } else if ("subtract".equals(args[0])) {
      System.out.println(calc.subtract(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
    } else if ("multiply".equals(args[0])) {
      System.out.println(calc.multiply(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
    } else if ("divide".equals(args[0])) {
      System.out.println(calc.divide(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
    } else if ("fibonacci".equals(args[0])) {
      System.out.println(calc.fibonacciNumberFinder(Integer.parseInt(args[1])));
    } else if ("binary".equals(args[0])) {
      System.out.println(calc.intToBinaryNumber(Integer.parseInt(args[1])));
    }

  }

}