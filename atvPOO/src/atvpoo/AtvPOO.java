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
public class AtvPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          GrupoDeProdutos g1 = new GrupoDeProdutos(5, "Paulo");
          System.out.println("numero: " + g1.getCodigo() + "nome: " + g1.getNome());
          
          Item i1 = new Item(10);
          System.out.println("Item: " + i1.getQuantidade());
          
          Produto p1 = new Produto(10, "Arroz", 20);
          System.out.println("produto: " + p1.getCodigo() + p1.getDescricao() + p1.getPreco());
          
          Relatorio r1 = new Relatorio(10000);
          System.out.println("Vendeu: " + r1.getTotalDeVenda());
          
          Unidade u1 = new Unidade(10, "Peixe");
          System.out.println("Unidade: " + u1.getCodigo() + u1.getDescricao());
    }
}