package com.algaworks.algafood.jpa;

import com.algaworks.algafood.domain.model.Cozinha;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class CadastroCozinha {

    @PersistenceContext
    private EntityManager manager;

    public List<Cozinha> listar() {
        TypedQuery<Cozinha> query = manager.createQuery("select c from Cozinha c", Cozinha.class);
        return query.getResultList();

//        return manager.createQuery("select c from Cozinha c", Cozinha.class).getResultList(); // mesmo Código em uma Linha
    }

    public Cozinha buscar(Long id) {
        return manager.find(Cozinha.class, id);
    }


    @Transactional
    public Cozinha salvar(Cozinha cozinha) {
       return manager.merge(cozinha);
    }


    @Transactional
    public void remover(Cozinha cozinha) {
        cozinha = buscar(cozinha.getId());
        manager.remove(cozinha);
    }


}
