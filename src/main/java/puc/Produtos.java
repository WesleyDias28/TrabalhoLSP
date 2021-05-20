package puc;

import org.joda.time.LocalDate;

public class Produtos {
    private Integer id;
    private String product;
    private Double amount;
    private Double price;
    private LocalDate data;

    /**
     * Cadastrar Produtos.
     * 
     * @return dos Produtos
     */
    public boolean cadastrarProdutos(Integer id, String product, Double amount, Double price, LocalDate data) {
        if ((amount <= 0.0) || (price <= 0.0))
            throw new IllegalArgumentException("Não são permitidos valores igual ou menor que zero.");

        if (data == null)
            throw new IllegalArgumentException("A data não pode ser nula.");

        this.id = id;
        this.product = product;
        this.amount = amount;
        this.price = price;
        this.data = data;
        if (product != "")
            return true;
        else
            return false;
    }
    
    /**
     * Retorna o id do produto.
     * 
     * @return id do produto
     */
    public Integer getid() {
        return id;
    }

    /**
     * Retorna o nome do produto.
     * 
     * @return nome do produto
     */
    public String getproduct() {
        return product;
    }

    /**
     * Retorna a quantidade.
     * 
     * @return quantidade
     */
    public Double getamount() {
        return amount;
    }

    /**
     * Retorna a data.
     * 
     * @return data
     */
    public LocalDate getdata() {
        return data;
    }

    /**
     * Retorna o preco do produto.
     * 
     * @return preco do produto
     */
    public Double getprice() {
        return price;
    }
}
