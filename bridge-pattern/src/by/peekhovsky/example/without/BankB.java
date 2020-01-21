package by.peekhovsky.example.without;

/**
 * @author Rastsislau Piakhouski 2020
 */
public abstract class BankB implements Bank {
  @Override
  public void doSomething() {
    System.out.println("Bank B is doing something.");
  }
}
