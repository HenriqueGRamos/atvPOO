/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvpoo;

/**
 *
 * @author hique
 */
public class Produto {
    private int codigo;
    private String descricao;
    private float preco;

    public Produto(int codigo, String descricao, float preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("{codigo: ")
                .append(this.codigo)
                .append("descricao: ")
                .append(this.descricao)
                .append("preco: ")
                .append(this.preco)
                .append("}");
        return sb.toString();
                                    
    }
    
}
