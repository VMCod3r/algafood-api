package com.algaworks.algafood;

import com.algaworks.algafood.di.notificacao.NotificadorEmail;
import com.algaworks.algafood.di.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class AlgaConfig {

    @Bean
    public NotificadorEmail notificadorEmail() {
        NotificadorEmail notificador = new NotificadorEmail("smt.algamail.com.br");
        notificador.setCaixaAlta(true);

        return notificador;
    }

    @Bean
    public AtivacaoClienteService ativacaoClienteService() {
        return new AtivacaoClienteService(notificadorEmail());
    }
}
