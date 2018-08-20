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
public class Item {
    private int quantidade;

    public Item(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("{quantidade: ")
                .append(this.quantidade)
                .append("}");
        return sb.toString();
    }
    
    
}
