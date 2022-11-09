package di.notificacao;

import di.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component
public class NotifadorEmail {

    public NotifadorEmail() {
        System.out.println("Construtor Chamado!");
    }

    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s através do e-mail %s: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
