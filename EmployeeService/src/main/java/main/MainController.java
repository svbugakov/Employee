package main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @RequestMapping("/showConfig")
    @ResponseBody
    public String main() {
        return "hello!";
    }
}
