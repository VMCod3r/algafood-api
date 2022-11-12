package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    @Autowired
    private Notificador notificador;

//    @Autowired
//    public AtivacaoClienteService(Notificador notificador) {
//        this.notificador = notificador;
//    }

//    public AtivacaoClienteService(String qualquerCoisa) {
//
//    }

    public void ativar(Cliente cliente) {
        cliente.ativar();
        this.notificador.notificar(cliente, "Seu Cadastro no Sistema está Ativo!");
    }

//    @Autowired
//    public void setNotificador(Notificador notificador) {
//        this.notificador = notificador;
//    }
}


/**
 * Ponto de Injeção 1: Construtor (Quando Houver apenas um construtor na Classe, não é necessário a anotação @Autowired, pois o Sprint injeta Automagicamente, entretando se houver
 * mais que um Construtor, faz-se necessário informar através da Anotação @Autowired, qual é o construtor que o Spring deverá injetar.
 *
 * Ponto de Injeção 2: Atráves do Set com a Anotação @Autowired
 *
 * Ponto de Injeção 3: é Diretamente no Atributo, com a Anotação @Autowired
 *
 */