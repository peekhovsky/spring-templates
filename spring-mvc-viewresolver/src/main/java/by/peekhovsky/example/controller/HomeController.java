package by.peekhovsky.example.controller;

import by.peekhovsky.example.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author Rastsislau Piakhouski 2020
 */
@Controller
public class HomeController {
  @GetMapping
  public String home(Locale locale, Model model) {
    System.out.println("Home Page Requested, locale = " + locale);
    Date date = new Date();
    DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
    String formattedDate = dateFormat.format(date);
    model.addAttribute("serverTime", formattedDate);
    return "home";
  }

  @PostMapping(value = "/user")
  public String user(@Validated User user, Model model) {
    System.out.println("User Page Requested");
    model.addAttribute("username", user.getUsername());
    return "user";
  }
}
