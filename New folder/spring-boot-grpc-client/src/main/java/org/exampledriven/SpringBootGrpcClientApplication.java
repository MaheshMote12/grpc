package org.exampledriven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.netflix.discovery.EurekaClientConfig;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.util.RoundRobinLoadBalancerFactory;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootGrpcClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootGrpcClientApplication.class, args);
    }
    
    @Value("${grpc.eureka.service-id}")
    private String eurekaServiceId;

    @Autowired
    EurekaClientConfig eurekaClientConfig;
    
    @Autowired
    private DiscoveryClient discoveryClient;

    @Bean
    @ConditionalOnMissingBean(ManagedChannel.class)
    public ManagedChannel defaultManagedChannel() {

        return ManagedChannelBuilder
                .forTarget("eureka://" + eurekaServiceId)
                .nameResolverFactory(new EurekaNameResolverProvider(eurekaClientConfig, "grpc.port"))
                .loadBalancerFactory(RoundRobinLoadBalancerFactory.getInstance())
                .usePlaintext(true)
                .build();
}
    
}
