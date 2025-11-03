package br.edu.iffarroupilha.autocentersb.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository
        extends JpaRepository<Veiculo, Long> {
}
