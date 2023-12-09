package br.com.desafiomobiauto.specification;

import br.com.desafiomobiauto.specification.model.Cliente;
import br.com.desafiomobiauto.specification.model.Genero;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class ClienteGeneroFilter implements Specification<Cliente> {
    private final Genero sexo;

    public ClienteGeneroFilter(Genero sexo) {
        super();
        this.sexo = sexo;
    }

    @Override
    public Predicate toPredicate(Root<Cliente> root, CriteriaQuery<?> query,
                                 CriteriaBuilder criteriaBuilder) {
        return criteriaBuilder.equal(root.get("sexo"), sexo);
    }
}
