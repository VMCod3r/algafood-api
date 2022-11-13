package com.algaworks.algafood.infrastructure.repository;

import com.algaworks.algafood.domain.model.Estado;
import com.algaworks.algafood.domain.repository.EstadoRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class EstadoRepositoryImpl implements EstadoRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Estado> listar() {
        TypedQuery<Estado> query = manager.createQuery("select e from Estado e", Estado.class);
        return query.getResultList();

//        return manager.createQuery("select e from Estado e", Estado.class).getResultList(); // mesmo Código em uma Linha
    }

    @Override
    public Estado buscar(Long id) {
        return manager.find(Estado.class, id);
    }


    @Override
    @Transactional
    public Estado salvar(Estado estado) {
        return manager.merge(estado);
    }


    @Override
    @Transactional
    public void remover(Estado estado) {
        estado = buscar(estado.getId());
        manager.remove(estado);
    }
}
