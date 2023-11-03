package produto.crud.crud_produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import produto.crud.crud_produto.model.Produto;
import produto.crud.crud_produto.repository.ProdutoRepository;

@SpringBootApplication
public class CrudProdutoApplication implements CommandLineRunner {

	public static void main(String[] args) {SpringApplication.run(CrudProdutoApplication.class, args);}
	@Autowired
	private ProdutoRepository produtoRepository;
	@Override
	public void run(String... args) throws Exception {
		Produto produto = new Produto();
		produto.setNome("macBook");
		produto.setValor(12.000);
		produtoRepository.save(produto);

		Produto produto1 = new Produto();
		produto1.setNome("Camiseta Adidas");
		produto1.setValor(299.99);
		produtoRepository.save(produto);
	}
}
