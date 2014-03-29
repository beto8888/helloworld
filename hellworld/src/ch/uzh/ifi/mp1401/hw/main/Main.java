package ch.uzh.ifi.mp1401.hw.main;

public class Main {

  public static void main(final String[] args) {
    System.out.println("Hello World!");
  }

  public static void internCall() {
    this.callAFunction();
  }
  
  public static void callAFunction() {
    System.out.println("First Fork");
  }
}
