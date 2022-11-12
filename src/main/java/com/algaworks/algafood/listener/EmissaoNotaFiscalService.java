package com.algaworks.algafood.listener;

import com.algaworks.algafood.di.service.ClienteAtivadoEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmissaoNotaFiscalService {

    @EventListener
    public void clienteAtivadoListner(ClienteAtivadoEvent event) {
        System.out.println("Emitindo Nota Fiscal para Cliente " + event.getCliente().getNome());
    }
}
