package com.knowhow.poc.composite.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.Resource;

@Getter
@ConfigurationProperties(prefix = "app", ignoreUnknownFields = false)
public class AppProperties {

    private final Swagger swagger = new Swagger();
    private final Jwt jwt = new Jwt();

    @Getter
    @Setter
    static class Swagger {

        private String title;
        private String description;
        private String version;
        private String termsOfServiceUrl;
        private String contactName;
        private String contactUrl;
        private String contactEmail;
        private String license;
        private String licenseUrl;
    }

    @Getter
    @Setter
    static class Jwt {

        private Resource publicKey;


    }
}
