package di.service;

import di.modelo.Cliente;
import di.notificacao.NotifadorEmail;

public class AtivacaoClienteService {

    private NotifadorEmail notificador;

    public void ativar(Cliente cliente) {
        cliente.ativar();
        this.notificador.notificar(cliente, "Seu Cadastro no Sistema está Ativo!");
    }
}
