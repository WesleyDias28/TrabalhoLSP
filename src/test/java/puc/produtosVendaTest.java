package puc;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import java.util.List;

import org.joda.time.LocalDate;
import org.junit.Before;
import org.junit.Test;

public class produtosVendaTest {
    private Produtos produto1;
    private Produtos produto2;
    private Produtos produto3;
    private Produtos produto4;
    
    @Before
    public void init()
    {
        produto1 = new Produtos(1, "Arroz", 2.0, 3.0, LocalDate.now());
        produto2 = new Produtos(2, "Feijao", 2.0, 4.0, LocalDate.now());
        produto3 = new Produtos(3, "Macarrao", 4.0, 5.0, LocalDate.now());
        produto4 = new Produtos(4, "Oleo", 4.0, 6.0, LocalDate.now());
    }

    @Test
    public void deveRealizarVenda() {
        List<Produtos> produto = Arrays.asList(produto1, produto2, produto3, produto4);

        produtosVenda produtoCadastrado = new produtosVenda(1 , produto, 2.0, LocalDate.now());
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarUmaExcecaoParaQuantidadeZerado() {
        List<Produtos> produto = Arrays.asList(produto1, produto2, produto3, produto4);

        produtosVenda produtoCadastrado = new produtosVenda(1 , produto, 0.0, LocalDate.now());
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarUmaExcecaoParaDataNula() {
        List<Produtos> produto = Arrays.asList(produto1, produto2, produto3, produto4);

        produtosVenda produtoCadastrado = new produtosVenda(1 , produto, 2.0, null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarUmaExcecaoParaorderNumberZerado() {
        List<Produtos> produto = Arrays.asList(produto1, produto2, produto3, produto4);

        produtosVenda produtoCadastrado = new produtosVenda(0 , produto, 1.0, LocalDate.now());
    }
}
