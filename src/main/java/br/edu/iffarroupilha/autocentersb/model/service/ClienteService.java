package br.edu.iffarroupilha.autocentersb.model.service;

import br.edu.iffarroupilha.autocentersb.model.Cliente;
import br.edu.iffarroupilha.autocentersb.model.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClienteService extends BaseService<Cliente, ClienteRepository> {
    public ClienteService(ClienteRepository clienteRepository) {
        super(clienteRepository);
    }
}
