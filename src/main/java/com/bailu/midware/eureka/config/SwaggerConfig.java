package com.bailu.midware.eureka.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author:guobailu
 * @description:Swagger配置类，可视化调试工具
 * @date:2019/12/1 @time:上午1:17
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.bailu.midware.eureka.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(ApiInfo.DEFAULT);
    }

    private ApiInfo apiInfo(){
        ApiInfo apiInfo = new ApiInfo("Restful API", "可视化调试入口", "V1.0", "terms of service", "834985142@qq.com", "开源", "none");
        return apiInfo;
    }
}
