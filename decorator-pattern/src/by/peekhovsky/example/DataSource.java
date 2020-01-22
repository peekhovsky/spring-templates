package by.peekhovsky.example;

/**
 * @author Rastsislau Piakhouski 2020
 */
public interface DataSource {
  void write(String data);

  String read();
}
