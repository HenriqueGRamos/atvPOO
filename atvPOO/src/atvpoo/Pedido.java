/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvpoo;

import java.util.Date;

/**
 *
 * @author hique
 */
public class Pedido {
    private int numero;
    private Date data;

    public Pedido(int numero, Date data) {
        this.numero = numero;
        this.data = data;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("{numero: ")
                .append(this.numero)
                .append("data: ")
                .append(this.data)
                .append("}");
        
        return sb.toString();
    }
    
}
