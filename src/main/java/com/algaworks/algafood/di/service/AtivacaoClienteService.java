package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.NivelUrgencia;
import com.algaworks.algafood.di.notificacao.Notificador;
import com.algaworks.algafood.di.notificacao.TipoDoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

//@Component
public class AtivacaoClienteService {

    @Autowired
    @TipoDoNotificador(NivelUrgencia.NORMAL)
    private Notificador notificador;



//    @PostConstruct
    public void  init() {
        System.out.println("INIT!");
    }


//    @PreDestroy
    public void  destroy() {
        System.out.println("DESTROY!");
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

      notificador.notificar(cliente, "Seu Cadastro no Sistema está Ativo!");

    }

}