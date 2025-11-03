package br.edu.iffarroupilha.autocentersb.controller;

import br.edu.iffarroupilha.autocentersb.model.Veiculo;
import br.edu.iffarroupilha.autocentersb.model.service.VeiculoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController
extends  BaseController<Veiculo, VeiculoService>
{
    public  VeiculoController(VeiculoService service)
    {
        super(service);
    }
}
