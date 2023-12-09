package br.com.desafiomobiauto;

import br.com.desafiomobiauto.specification.ClienteFilter;
import br.com.desafiomobiauto.specification.ClienteService;
import br.com.desafiomobiauto.specification.model.Cliente;
import br.com.desafiomobiauto.specification.model.Genero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DesafioMobiautoApplication {

	@Autowired
	private ClienteService service;

	public static void main(String[] args) {
		SpringApplication.run(DesafioMobiautoApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() {
		return (args) -> {
			List<Cliente> lista = service.listar(ClienteFilter.builder()
					.nome("Pedro")
					.telefone("085996574872")
					.sexo(Genero.MASCULINO)
					.build());
			lista.forEach(System.out::println);
		};
	}
}
