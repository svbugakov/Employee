package main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;
}
