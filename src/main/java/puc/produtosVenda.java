package puc;

import org.joda.time.LocalDate;
import java.util.List;

public class produtosVenda {
    private Integer orderNumber; 
    private Double Value;
    private Double amount;
    private Integer productId;
    private LocalDate data;

    /**
     * Venda.
     * 
     * @return Venda dos produtos
     */
    public void realizarVendaItens(Integer orderNumber, List<Produtos> produto, Double amount, LocalDate data) {
        Double totalValue;
        if ((amount <= 0.0) || (Value <= 0.0))
            throw new IllegalArgumentException("Não são permitidos valores igual ou menor que zero.");
        if (orderNumber < 0)
            throw new IllegalArgumentException("Não são permitidos valores menor que zero.");
        if (data == null)
            throw new IllegalArgumentException("A data não pode ser nula.");

        this.orderNumber = orderNumber;
        this.Value = produto.get(0).getprice();
        this.amount = amount;
        this.productId = produto.get(0).getid();
        this.data = data;

        totalValue = (amount * Value);

        Venda venda = new Venda();

        venda.realizarVendas(orderNumber, totalValue, amount, data);
    }
}
