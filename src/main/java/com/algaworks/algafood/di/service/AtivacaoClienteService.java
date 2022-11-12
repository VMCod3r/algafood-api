package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AtivacaoClienteService {

    @Autowired
    @Qualifier("urgente")
    private Notificador notificador;

    public void ativar(Cliente cliente) {
        cliente.ativar();

      notificador.notificar(cliente, "Seu Cadastro no Sistema está Ativo!");

    }

}


/**
 * Quando há mais de um Bean, o Spring não sabe identificar qual deve instanciar: AMBIGUIDADE é o Termo.
 *
 * Faz-se Necessário realizar um processo de DESAMBIGUAÇÃO.
 */