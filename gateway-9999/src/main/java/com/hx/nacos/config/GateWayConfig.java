package com.hx.nacos.config;


import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hx
 * @version 1.0.0
 * @createTime 2022/1/10 13:54
 * @description
 * @editUser hx
 * @editTime 2022/1/10 13:54
 * @editDescription  注意: 此处的映射地址, 其中后面的地址必须一样, 否则不生效
 *   http://127.0.0.1:9999/hx/custom
 *   http://127.0.0.1:9001/hx/custom
 */
@Configuration
public class GateWayConfig {


    /**
     *
     *
     * */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        System.out.println("1111");
        //构建多个builder
        RouteLocatorBuilder.Builder builder = routeLocatorBuilder.routes();
        //具体的路由地址， 将地址路由到9001
        builder.route("path_hx", r -> r.path("/hx/**").uri("http://localhost:9001/nacos-provider")).build();
        //返回所有路由规则
        return builder.build();
    }



}
