package by.peekhovsky.example;

import by.peekhovsky.example.config.ApplicationConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author Rastsislau Piakhouski 2020
 */
public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class<?>[]{
        ApplicationConfig.class
    };
  }

  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class<?>[]{
        ApplicationConfig.class
    };
  }

  @Override
  protected String[] getServletMappings() {
    return new String[]{"/"};
  }
}
