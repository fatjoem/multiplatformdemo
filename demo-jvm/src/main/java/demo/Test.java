package demo;

import demo.common.FancyText;

public class Test {
  public static void main(String[] args) {
    final FancyText fancyText = new FancyText("Test");

    final String string = fancyText.toString();
    System.out.println(string);
  }
}