package br.com.aulajava.aulaapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.aulajava.aulaapi.Model.Contato;



@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {
    
}
