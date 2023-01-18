package spring;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositorio de entidades <code>ContaBancaria</code>.
 */
public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Integer> {

}