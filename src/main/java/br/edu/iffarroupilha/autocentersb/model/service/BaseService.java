package br.edu.iffarroupilha.autocentersb.model.service;

import br.edu.iffarroupilha.autocentersb.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Classe genérica que agrupa comportamentos
 * de lógica comuns as entidades. Aplica-se
 * o conceito de Method Template
 * @since 03/11/2025 19:19
 */
public abstract class BaseService
        <ENTITY, REPOSITORY extends JpaRepository<ENTITY, Long>> {
    protected REPOSITORY repository;

    // initializa o reposit;orio
    public BaseService(REPOSITORY repository) {
        this.repository = repository;
    }

    public ENTITY salvar(ENTITY novaEntidade) {
        return repository.save(novaEntidade);
    }

    public List<ENTITY> buscarTodos() {
        return this.repository.findAll();
    }

    public void delete(Long id){
        this.repository.deleteById(id);
    }
}