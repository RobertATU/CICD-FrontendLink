package ie.atu.cicdfrontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CicdFrontendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CicdFrontendApplication.class, args);
    }

}
