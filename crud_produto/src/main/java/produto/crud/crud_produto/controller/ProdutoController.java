package produto.crud.crud_produto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import produto.crud.crud_produto.exception.ResourceNotFoundException;
import produto.crud.crud_produto.model.Produto;
import produto.crud.crud_produto.repository.ProdutoRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public List<Produto> getAllProdutos(){
        return produtoRepository.findAll();
    }

    //REST API de produto
    public Produto createProduto(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }

    //Construção do get Produto através do id
    @GetMapping("{id}")
    public ResponseEntity<Produto> getProdutoById(@PathVariable Long id){
    Produto produto = produtoRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Não exite produto com o id:" + id));
    return ResponseEntity.ok(produto);
    }
}
