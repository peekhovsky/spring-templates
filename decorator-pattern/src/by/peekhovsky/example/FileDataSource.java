package by.peekhovsky.example;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Optional;

/**
 * @author Rastsislau Piakhouski 2020
 */
public class FileDataSource implements DataSource {

  private String filename;

  public FileDataSource(String filename) {
    this.filename = filename;
  }

  @Override
  public void write(String data) {
    File file = new File(filename);
    try (OutputStream fos = new FileOutputStream(file)) {
      fos.write(data.getBytes(), 0, data.length());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public String read() {
    char[] buffer = new char[0];
    File file = new File(filename);
    try (FileReader reader = new FileReader(file)) {
      buffer = new char[(int) file.length()];
      reader.read(buffer);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return new String(buffer);
  }
}
