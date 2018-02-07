package in.phani.springboot.swaggeraggregator.config;

import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.List;
import java.util.stream.Collectors;

@Configuration
@Primary
class PropertyResourceProvider implements SwaggerResourcesProvider {

  private final SwaggerServicesConfig config;

  @Autowired
  public PropertyResourceProvider(final SwaggerServicesConfig config) {
    this.config = config;
  }

  @Override
  public List<SwaggerResource> get() {
    return config.getServices().stream().map(swaggerService -> {
      SwaggerResource swaggerResource = new SwaggerResource();
      swaggerResource.setLocation(swaggerService.getUrl());
      swaggerResource.setName(swaggerService.getName());
      swaggerResource.setSwaggerVersion(swaggerService.getVersion());
      return swaggerResource;
    }).collect(Collectors.toList());

  }
}
