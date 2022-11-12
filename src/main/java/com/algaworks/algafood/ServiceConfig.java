package com.algaworks.algafood;

import com.algaworks.algafood.di.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public AtivacaoClienteService ativacaoClienteService() {
        return new AtivacaoClienteService();
    }
}

/**
 * Forma 2 de utilizar inicialização de Métodos  e Destriuição
 */