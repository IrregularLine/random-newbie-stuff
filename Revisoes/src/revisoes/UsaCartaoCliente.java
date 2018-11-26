/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisoes;

/**
 *
 * @author Diogo
 */
public class UsaCartaoCliente {
    public static void main(String[] args) {
        int x,y;
        CartaoCliente p = new CartaoCliente();
        System.out.println(p);
        p.setN_cartao(123);
        p.setTitular("Diogo");
        System.out.println(p);
        CartaoCliente c = new CartaoCliente(321, "Francisco");
        x = p.getN_pontos();
        y = c.getN_pontos();
        System.out.println("Nº de pontos: "+ x+" e cartao 2: "+ y);
        p.creditar(45);
        x = p.getN_pontos();
        System.out.println("Nº de pontos: "+ x+" e cartao 2: "+ y);
        c.transfere(p);
        x = p.getN_pontos();
        y = c.getN_pontos();
        System.out.println("Nº de pontos: "+ x+" e cartao 2: "+ y);
        c.debitar(20);
        x = p.getN_pontos();
        y = c.getN_pontos();
        System.out.println("Nº de pontos: "+ x+" e cartao 2: "+ y);
        
    }
}
