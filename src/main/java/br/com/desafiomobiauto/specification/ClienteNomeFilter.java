package br.com.desafiomobiauto.specification;

import br.com.desafiomobiauto.specification.model.Cliente;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class ClienteNomeFilter implements Specification<Cliente> {
    private final String nome;

    public ClienteNomeFilter(String nome) {
        super();
        this.nome = nome;
    }

    @Override
    public Predicate toPredicate(Root<Cliente> root, CriteriaQuery<?> query,
                                 CriteriaBuilder criteriaBuilder) {
        return criteriaBuilder.like(root.get("nome"), "%"+ nome +"%");
    }
}
