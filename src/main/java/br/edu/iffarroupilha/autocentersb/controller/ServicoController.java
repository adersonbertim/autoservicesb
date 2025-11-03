package br.edu.iffarroupilha.autocentersb.controller;

import br.edu.iffarroupilha.autocentersb.model.Cliente;
import br.edu.iffarroupilha.autocentersb.model.Servico;
import br.edu.iffarroupilha.autocentersb.model.service.ClienteService;
import br.edu.iffarroupilha.autocentersb.model.service.ServicoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servico")
public class ServicoController extends BaseController<Servico, ServicoService > {

    public ServicoController(ServicoService servico) {
      super(servico);
    }

    @GetMapping("/busca-por-descricao/{termo}")
    public List<Servico> teste(@PathVariable String termo){
        return  service.buscaPorDescricao(termo);
    }
}
