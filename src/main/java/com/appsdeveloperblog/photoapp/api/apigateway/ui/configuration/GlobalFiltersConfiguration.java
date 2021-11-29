package com.appsdeveloperblog.photoapp.api.apigateway.ui.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import reactor.core.publisher.Mono;

@Configuration
public class GlobalFiltersConfiguration {

    final Logger logger = LoggerFactory.getLogger(GlobalFiltersConfiguration.class);

    @Order(1)
    @Bean
    public GlobalFilter secondPreFilter() {
        return (exchange, chain) -> {
            logger.info("My second global pre Filter is executed....");
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                logger.info("My Second global post-filter was executed.....");
            }));
        };
    }

    @Order(2)
    @Bean
    public GlobalFilter thirdPreFilter() {
        return (exchange, chain) -> {
            logger.info("My third global pre Filter is executed....");
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                logger.info("My third global post-filter was executed.....");
            }));
        };
    }

    @Order(3)
    @Bean
    public GlobalFilter fourthPreFilter() {
        return (exchange, chain) -> {
            logger.info("My fourth global pre Filter is executed....");
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                logger.info("My fourth global post-filter was executed.....");
            }));
        };
    }


    @Order(6)
    @Bean
    public GlobalFilter fivePreFilter() {
        return (exchange, chain) -> {
            logger.info("My five global pre Filter is executed....");
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                logger.info("My five global post-filter was executed.....");
            }));
        };
    }



    @Order(5)
    @Bean
    public GlobalFilter sixPreFilter() {
        return (exchange, chain) -> {
            logger.info("My six global pre Filter is executed....");
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                logger.info("My six global post-filter was executed.....");
            }));
        };
    }



    @Order(6)
    @Bean
    public GlobalFilter sevenPreFilter() {
        return (exchange, chain) -> {
            logger.info("My seven global pre Filter is executed....");
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                logger.info("My seven global post-filter was executed.....");
            }));
        };
    }



    @Order(7)
    @Bean
    public GlobalFilter eigthPreFilter() {
        return (exchange, chain) -> {
            logger.info("My eigth global pre Filter is executed....");
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                logger.info("My eigth global post-filter was executed.....");
            }));
        };
    }



    @Order(8)
    @Bean
    public GlobalFilter ninePreFilter() {
        return (exchange, chain) -> {
            logger.info("My nine global pre Filter is executed....");
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                logger.info("My nine global post-filter was executed.....");
            }));
        };
    }


}
