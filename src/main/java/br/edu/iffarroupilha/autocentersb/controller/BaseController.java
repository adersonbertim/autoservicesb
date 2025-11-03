package br.edu.iffarroupilha.autocentersb.controller;

import br.edu.iffarroupilha.autocentersb.model.Cliente;
import br.edu.iffarroupilha.autocentersb.model.service.BaseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Classe generica que agrupa as acoes comuns as chamadas HTTP.
 * Aplcia-se o padrão template method
 */
public abstract class BaseController
<E, S extends BaseService<E , ? >>
{
    protected  S service;

    public BaseController(S servico) {
        this.service = servico;
    }
    @CrossOrigin("http://localhost:4200")
    @GetMapping()
    public List<E> listar() {
        return service.buscarTodos();
    }

    @CrossOrigin("http://localhost:4200")
    @PostMapping
    public void cadastrarNovo(@RequestBody E entidade) {
        service.salvar(entidade);
    }

    @CrossOrigin("http://localhost:4200")
    @PutMapping
    public void atualizar(@RequestBody E entidade) {
        service.salvar(entidade);
    }

    @DeleteMapping("/{id}")
    public void deletar(@RequestParam Long id) {
        service.delete(id);
    }

}
