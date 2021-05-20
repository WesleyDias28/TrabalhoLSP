package puc;

import org.joda.time.LocalDate;

public class Venda {
    private Integer orderNumber; 
    private Double totalValue;
    private Double amount;
    private LocalDate data;

    /**
     * Venda.
     * 
     * @return Venda dos produtos
     */
    public Integer realizarVendas(Integer orderNumber, Double totalValue, Double amount, LocalDate data) {
        if ((amount <= 0.0) || (totalValue <= 0.0))
            throw new IllegalArgumentException("Não são permitidos valores igual ou menor que zero.");

        if (data == null)
            throw new IllegalArgumentException("A data não pode ser nula.");

        this.orderNumber = orderNumber;
        this.totalValue = totalValue;
        this.amount = amount;
        this.data = data;
        return orderNumber;
    }
}
