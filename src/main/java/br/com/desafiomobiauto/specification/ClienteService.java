package br.com.desafiomobiauto.specification;

import br.com.desafiomobiauto.specification.model.Cliente;
import br.com.desafiomobiauto.specification.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Component
@RequiredArgsConstructor
public class ClienteService {
    private final ClienteRepository clienteRepository;
    public List<Cliente> listar(ClienteFilter filtros) {
        return clienteRepository.findAll(getAllSpecs(filtros));
    }

    private Specification<Cliente> getAllSpecs(ClienteFilter filtros) {
        List<SpecificationOfCliente> specs = Arrays
                .asList(this::getByNome, this::getByTelefone, this::getByGenero);

        Specification<Cliente> resultado = null;

        for (SpecificationOfCliente spec: specs) {
            Specification<Cliente> next = spec.getSpec(filtros);
            if (Objects.nonNull(next)) {
                if (Objects.isNull(resultado)) {
                    resultado = next;
                    continue;
                }

                resultado = resultado.and(next);
            }
        }

        return resultado;
    }

    private Specification<Cliente> getByNome(ClienteFilter filtros) {
        if (filtros.getNome() != null) {
            return new ClienteNomeFilter(filtros.getNome());
        }
        return null;
    }

    private Specification<Cliente> getByTelefone(ClienteFilter filtros) {
        if (filtros.getTelefone() != null) {
            return new ClienteTelefoneFilter(filtros.getTelefone());
        }
        return null;
    }

    private Specification<Cliente> getByGenero(ClienteFilter filtros) {
        if (filtros.getSexo() != null) {
            return new ClienteGeneroFilter(filtros.getSexo());
        }
        return null;
    }

    @FunctionalInterface
    interface SpecificationOfCliente {
        Specification<Cliente> getSpec(ClienteFilter filtros);
    }
}
