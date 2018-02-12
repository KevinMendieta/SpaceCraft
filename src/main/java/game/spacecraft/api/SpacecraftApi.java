package game.spacecraft.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author KevinMendieta
 */
@SpringBootApplication
@ComponentScan(basePackages = {"game.spacecraft.app"})
public class SpacecraftApi {

    public static void main(String[] args) {
        SpringApplication.run(SpacecraftApi.class, args);
    }

}
