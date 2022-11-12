package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AtivacaoClienteService {

    @Autowired
    private List<Notificador> notificadores; //Para Notificar com todos os notificadores disponíveis.

    public void ativar(Cliente cliente) {
        cliente.ativar();

        //Neste Caso Notificados os Clientes com todos os Notificadores Disponiveis....
        notificadores.forEach(notificador -> notificador.notificar(cliente, "Seu Cadastro no Sistema está Ativo!"));

    }

}


/**
 * Quando há mais de um Bean, o Spring não sabe identificar qual deve instanciar: AMBIGUIDADE é o Termo.
 *
 * Faz-se Necessário realizar um processo de DESAMBIGUAÇÃO.
 */