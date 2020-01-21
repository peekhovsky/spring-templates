package by.peekhovsky.example.without;

/**
 * @author Rastsislau Piakhouski 2020
 */
public abstract class BankA implements Bank {
  @Override
  public void doSomething() {
    System.out.println("Bank A is doing something.");
  }
}
