package br.com.desafiomobiauto.specification;

import br.com.desafiomobiauto.specification.model.Cliente;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class ClienteTelefoneFilter implements Specification<Cliente> {
    private final String telefone;

    public ClienteTelefoneFilter(String telefone) {
        super();
        this.telefone = telefone;
    }

    @Override
    public Predicate toPredicate(Root<Cliente> root, CriteriaQuery<?> query,
                                 CriteriaBuilder criteriaBuilder) {
        return criteriaBuilder.equal(root.get("telefone"), telefone);
    }
}
