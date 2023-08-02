package br.com.aulajava.aulaapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aulajava.aulaapi.Model.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
