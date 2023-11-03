package produto.crud.crud_produto.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import produto.crud.crud_produto.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
