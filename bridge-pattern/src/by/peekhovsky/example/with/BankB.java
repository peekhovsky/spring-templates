package by.peekhovsky.example.with;

/**
 * @author Rastsislau Piakhouski 2020
 */
public class BankB implements Bank {

  private Type type;

  public BankB(Type type) {
    this.type = type;
  }

  @Override
  public void doSomething() {
    System.out.println("Bank B is doing something.");
  }

  @Override
  public void type() {
    type.type();
  }
}
