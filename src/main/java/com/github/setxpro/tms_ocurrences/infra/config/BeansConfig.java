package com.github.setxpro.tms_ocurrences.infra.config;

import com.github.setxpro.tms_ocurrences.domain.core.gateways.OcorenGateway;
import com.github.setxpro.tms_ocurrences.domain.core.usecases.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public CreateOcorenUseCase createOcorenUseCase(OcorenGateway ocorenGateway) {
        return new CreateOcorenUseCaseImpl(ocorenGateway);
    }
    @Bean
    public FindAllOcorenUseCase findAllOcorenUseCase(OcorenGateway ocorenGateway) {
        return new FindAllOcorenUseCaseImpl(ocorenGateway);
    }
    @Bean
    public FindOneOcorenUseCase findOneOcorenUseCase(OcorenGateway ocorenGateway) {
        return new FindOneOcorenUseCaseImpl(ocorenGateway);
    }
    @Bean
    public UpdateOneOcorenUseCase updateOneOcorenUseCase(OcorenGateway ocorenGateway) {
        return new UpdateOneOcorenUseCaseImpl(ocorenGateway);
    }
    @Bean
    public DeleteOneOcorenUseCase deleteOneOcorenUseCase(OcorenGateway ocorenGateway) {
        return new DeleteOneOcorenUseCaseImpl(ocorenGateway);
    }

}
