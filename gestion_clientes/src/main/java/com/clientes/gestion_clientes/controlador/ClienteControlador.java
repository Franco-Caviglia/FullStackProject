package com.clientes.gestion_clientes.controlador;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clientes.gestion_clientes.excepciones.ResourceNotFoundException;
import com.clientes.gestion_clientes.modelo.Cliente;
import com.clientes.gestion_clientes.repository.ClienteRepository;

@RestController
@RequestMapping("/api/v2")
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteControlador {
    
    @Autowired
    private ClienteRepository repository;

    //este metodo es para listar todos los clientes;
    @GetMapping("/clientes")
    public List<Cliente> listarTodosLosClientes(){ 
        return repository.findAll();
    }

    //este metodo es para guardar el empleado;
    @PostMapping("/clientes")
    public Cliente guardarCliente(@RequestBody Cliente cliente){
        return repository.save(cliente);
    }


    //metodo para buscar Cliente por ID, y arrojar excepcion si no lo encuentra;
    @GetMapping("/clientes/{id}")
    public ResponseEntity<Cliente> obtenerClienteId(@PathVariable Long id){
        Cliente cliente = repository.findById(id)
                            .orElseThrow(()-> new ResourceNotFoundException("No existe el cliente con el id: " + id));
        return ResponseEntity.ok(cliente);
    }

    //Este metodo actualiza la info de los clientes;
    @PutMapping("/clientes/{id}")
    public ResponseEntity<Cliente> actualizarCliente(@PathVariable Long id, @RequestBody Cliente detallesCliente){
        Cliente cliente = repository.findById(id)
                            .orElseThrow(()-> new ResourceNotFoundException("No existe el cliente con el id: " + id));
        
        cliente.setNombre(detallesCliente.getNombre());
        cliente.setApellido(detallesCliente.getApellido());
        cliente.setEmail(detallesCliente.getEmail());
        cliente.setTelefono(detallesCliente.getTelefono());
        cliente.setDni(detallesCliente.getDni());
        cliente.setTipoCliente(detallesCliente.getTipoCliente());
        
        Cliente clienteActualizado = repository.save(cliente);
        
        return ResponseEntity.ok(clienteActualizado);
    }

    @DeleteMapping("/clientes/{id}")
    public ResponseEntity<Map<String,Boolean>>eliminarCliente(@PathVariable Long id){
		Cliente cliente = repository.findById(id)
				            .orElseThrow(() -> new ResourceNotFoundException("No existe el empleado con el ID : " + id));
		
		repository.delete(cliente);
		Map<String, Boolean> respuesta = new HashMap<>();
		respuesta.put("eliminar",Boolean.TRUE);
		return ResponseEntity.ok(respuesta);
    }
}
