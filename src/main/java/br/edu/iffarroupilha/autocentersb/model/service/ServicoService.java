package br.edu.iffarroupilha.autocentersb.model.service;

import br.edu.iffarroupilha.autocentersb.model.Cliente;
import br.edu.iffarroupilha.autocentersb.model.ClienteRepository;
import br.edu.iffarroupilha.autocentersb.model.Servico;
import br.edu.iffarroupilha.autocentersb.model.ServicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoService extends  BaseService<Servico, ServicoRepository> {

    public ServicoService(ServicoRepository servicoRepository) {
       super(servicoRepository);

    }
    public List<Servico> buscaPorDescricao(String termo){
        return this.repository.findByDescricao(termo);
    }
}
