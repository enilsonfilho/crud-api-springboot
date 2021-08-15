package br.com.cliente.resource;

import br.com.cliente.entity.Cliente;
import br.com.cliente.service.ClienteService;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Enilson Filho
 */
@RestController
@RequestMapping(value = "/api")
public class ClienteResource {
    
    @Autowired
    private ClienteService clienteService;

    @ApiOperation("Recurso destinado para gravar clientes")
    @PostMapping("/cliente/gravar")
    public Cliente gravar(@RequestBody Cliente cliente){
        return clienteService.gravar(cliente);
    }
    
    @ApiOperation("Devolve uma lista full de clientes")
    @GetMapping("/clientes/listar")
    public List<Cliente> listar(){
        return clienteService.listar();
    }
    
    @ApiOperation("Exclui um cliente baseado no seu ID")
    @DeleteMapping("/cliente/deletar/{id}")
    public void excluir(@PathVariable(value = "id") long id ){
        clienteService.excluir(id);
    }
    
    @ApiOperation("Devolve um cliente baseado no seu ID")
    @GetMapping("/clientes/listar/{id}")
    public Optional<Cliente> clienteById(@PathVariable(value = "id") long id){
        return clienteService.clienteById(id);
    }
    
}
