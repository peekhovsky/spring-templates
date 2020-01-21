package by.peekhovsky.example.with;

/**
 * @author Rastsislau Piakhouski 2020
 */
public class BankA implements Bank {

  private Type type;

  public BankA(Type type) {
    this.type = type;
  }

  @Override
  public void doSomething() {
    System.out.println("Bank A is doing something.");
  }

  @Override
  public void type() {
    type.type();
  }
}
