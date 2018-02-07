package in.phani.springboot.swaggeraggregator.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix="documentation.swagger")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class SwaggerServicesConfig {
  List<SwaggerService> services;

  @Getter
  @Setter
  public static class SwaggerService {
    String name;
    String url;
    String version;
  }
}