package com.harmew.access.infra;

import com.harmew.access.core.ports.*;
import com.harmew.access.core.services.ResidentService;
import com.harmew.access.core.services.UserService;
import com.harmew.access.core.services.VisitantService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public UserServicePort userServiceImpl(UserRepositoryPort userRepositoryPort) {
        return new UserService(userRepositoryPort);
    }

    @Bean
    public ResidentServicePort residentServiceImpl(ResidentRepositoryPort residentRepositoryPort) {
        return new ResidentService(residentRepositoryPort);
    }

    @Bean
    public VisitantServicePort visitantServiceImpl(VisitantRepositoryPort visitantRepositoryPort) {
        return new VisitantService(visitantRepositoryPort);
    }
}