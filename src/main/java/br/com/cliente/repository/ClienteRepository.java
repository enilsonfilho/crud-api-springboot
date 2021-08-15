package br.com.cliente.repository;

import br.com.cliente.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Enilson Filho
 */
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
      
}
