package com.netshoes.sample.sleuth.notification;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Slf4j
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @RestController
  @RequestMapping("/notify")
  @AllArgsConstructor
  public class Controller {

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void notify(@RequestBody Notification notification) {
      log.info("Notification sent to {}", notification.getTo());
    }
  }
}
