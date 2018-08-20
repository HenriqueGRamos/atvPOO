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
public class Relatorio {
    private int totalDeVenda;

    public Relatorio(int totalDeVenda) {
        this.totalDeVenda = totalDeVenda;
    }

    public int getTotalDeVenda() {
        return totalDeVenda;
    }

    public void setTotalDeVenda(int totalDeVenda) {
        this.totalDeVenda = totalDeVenda;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{totalDeVenda: ")
                .append(this.totalDeVenda)
                .append("}");
        return sb.toString();
    }
    
}
