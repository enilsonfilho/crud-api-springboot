package br.com.cliente.service;

import br.com.cliente.entity.Cliente;
import br.com.cliente.repository.ClienteRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Enilson Filho
 */
@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    
    public Cliente gravar(Cliente cliente) {
        try {
            return clienteRepository.save(cliente);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  null;
    }

    public List<Cliente> listar() {
        try {
            return clienteRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void excluir(long id) {
        try {
            clienteRepository.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Optional<Cliente> clienteById(long id) {
        try {
            return clienteRepository.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
