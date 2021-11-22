package com.appsdeveloperblog.photoapp.api.apigateway.ui.security;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;


@Component
public class AuthorizationHeaderFilter extends AbstractGatewayFilterFactory<AuthorizationHeaderFilter.Config> {


    @Override
    public GatewayFilter apply(Config config) {
        return null;
    }

    public static class Config {

    }
}
