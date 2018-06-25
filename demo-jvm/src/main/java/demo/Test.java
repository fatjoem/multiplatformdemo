package demo;

import static dependency.DependencyCommonKt.dependencyCommon;

import demo.common.DemoCommon;
import demo.common.FancyText;
import dependency.DependencyCommon;

public class Test {
  public static void main(String[] args) {
    final FancyText fancyText = new FancyText("Test");

    final String string = fancyText.toString();
    System.out.println(string);

    System.out.println(new DependencyCommon());
    System.out.println(dependencyCommon());
    System.out.println(new DemoCommon());
  }
}