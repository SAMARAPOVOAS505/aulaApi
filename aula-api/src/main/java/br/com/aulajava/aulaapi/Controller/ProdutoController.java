package br.com.aulajava.aulaapi.Controller;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.aulajava.aulaapi.Model.Produto;
import br.com.aulajava.aulaapi.Repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {

  @Autowired
  private ProdutoRepository repository;
  @GetMapping
  public List<Produto> listar(){
    return repository.findAll();
  }

  @PostMapping
  public void inserir(){
    
  }
}
