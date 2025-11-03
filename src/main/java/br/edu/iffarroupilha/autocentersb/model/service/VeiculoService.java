package br.edu.iffarroupilha.autocentersb.model.service;

import br.edu.iffarroupilha.autocentersb.model.Veiculo;
import br.edu.iffarroupilha.autocentersb.model.VeiculoRepository;
import org.springframework.stereotype.Service;

@Service
public class VeiculoService
        extends BaseService<Veiculo, VeiculoRepository>
{
    public VeiculoService( VeiculoRepository veiculoRepository ){
        super(veiculoRepository);
    }
}
