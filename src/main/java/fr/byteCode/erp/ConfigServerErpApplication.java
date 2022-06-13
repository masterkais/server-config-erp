package fr.byteCode.erp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableConfigServer
@RestController
public class ConfigServerErpApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerErpApplication.class, args);
    }
    @GetMapping("/")
    public String getMessage() {
        return "Hello in config server project";
    }
}
