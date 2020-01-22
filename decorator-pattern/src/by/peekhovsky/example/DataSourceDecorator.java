package by.peekhovsky.example;

/**
 * @author Rastsislau Piakhouski 2020
 */
public class DataSourceDecorator implements DataSource {

  private DataSource dataSource;

  public DataSourceDecorator(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  @Override
  public void write(String data) {
    this.dataSource.write(data);
  }

  @Override
  public String read() {
    return this.dataSource.read();
  }
}
