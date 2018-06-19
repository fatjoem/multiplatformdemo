package demo;

import demo.common.DemoCommon;
import demo.common.FancyText;
import dependency.DependencyCommon;
import dependency.DependencyJvm;

public class Test {
  public static void main(String[] args) {
    final FancyText fancyText = new FancyText("Test");

    final String string = fancyText.toString();
    System.out.println(string);

    System.out.println(new DependencyJvm());
    System.out.println(new DependencyCommon());
    System.out.println(new DemoCommon());
  }
}