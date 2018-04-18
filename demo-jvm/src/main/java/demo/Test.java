package demo;

import demo.common.FancyText;

public class Test {
  public static void main(String[] args) {
    final FancyText fancyText = new FancyText("Test");

    // intellij shows an error for the following line:
    // (though it compiles and runs successfully with gradle)
    final String string = fancyText.toString();
    System.out.println(string);
  }
}