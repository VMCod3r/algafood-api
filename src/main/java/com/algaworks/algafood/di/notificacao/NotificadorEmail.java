package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmail implements Notificador {


    public NotificadorEmail() {
        System.out.println("Notificador Email PROD!");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s através do e-mail %s: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}

/**
 * @Qualifier: idenficação do Bean, quando for utilizar este bean, utiliza-se a mesma anotação para identificar qual BEAN será instanceado.
 *
 * Criando Anotações.
 */