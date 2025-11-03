package br.edu.iffarroupilha.autocentersb.controller;

import br.edu.iffarroupilha.autocentersb.model.Cliente;
import br.edu.iffarroupilha.autocentersb.model.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController extends
        BaseController<Cliente, ClienteService> {

    public ClienteController(ClienteService servico) {
        super(servico);
    }
    @GetMapping("/teste")
    public String teste(){
        return "Deu certo CI/CD";
    }
}
