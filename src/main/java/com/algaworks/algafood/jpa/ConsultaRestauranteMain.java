package com.algaworks.algafood.jpa;


import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.infrastructure.repository.RestauranteRepositoryImpl;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class ConsultaRestauranteMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE).run(args);


        RestauranteRepositoryImpl restaurantes = applicationContext.getBean(RestauranteRepositoryImpl.class);
        List<Restaurante> todosRestaurantes = restaurantes.listar();
        todosRestaurantes.forEach(restaurante -> System.out.printf("%s - %f - %s", restaurante.getNome(), restaurante.getTaxaFrete(), restaurante.getCozinha().getNome()));

    }
}
