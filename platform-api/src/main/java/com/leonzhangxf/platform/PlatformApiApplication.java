package com.leonzhangxf.platform;

import com.leonzhangxf.platform.configuration.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * The main class of this distribution unit.
 *
 * @author leonzhangxf 20180808
 */
@SpringBootApplication
@Import({
        SwaggerConfiguration.class,
})
public class PlatformApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatformApiApplication.class, args);
    }
}
