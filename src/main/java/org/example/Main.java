/**
 * This program shows the different equality methods for strings.
 */
public class Equality {
  public static void main(String[] args) {
    String className = "HelloThisIsAString";
    String methodName = "helloThisIsAString";


    // use strict equality
    System.out.println("Comparing className and methodName using strict equality");
    if (className.equals(methodName)) {
      System.out.printf("The className %s is equal to the methodName %s%n", className, methodName);
    } else {
      System.out.println("The class name %s is not equal to the methodName %s%n" + className + methodName);
    }

    // use case-insensitive equality
    System.out.println("Comparing className and methodName using case-insensitive equality");
    if (className.equalsIgnoreCase(methodName)) {
      System.out.printf("The className %s is equal to the methodName %s%n", className, methodName);
    } else {
      System.out.printf("The className %s is not equal to the methodName %s%n", className, methodName);
    }

    // use length of strings to compare
    System.out.println("Comparing className and methodName using length");
    if (className.length() == methodName.length()) {
      System.out.printf("The className %s is equal to the methodName %s%n", className, methodName);
    } else {
      System.out.printf("The className %s is not equal to the methodName %s%n", className, methodName);
    }

    // use lexicographical ordering
    System.out.println("Comparing className and methodName using lexicographical ordering");
    if (className.compareTo(methodName) == 0) {
      System.out.printf("The className %s is equal to the methodName %s%n", className, methodName);
    } else {
      System.out.printf("The className %s is not equal to the methodName %s%n", className, methodName);
    }
  }
}