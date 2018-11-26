/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1º.e.ultimo.nome;

import java.util.Scanner;
public class EUltimoNome {

  
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int a,b;
        System.out.println("Insira o seu nome completo");
        String x = leia.nextLine();
        String v[] = new String[x.length()];
        a = x.lastIndexOf(" ");
        System.out.println(a);
        v = x.split (" ");
        b = x.length();
        System.out.println(v[0] + " " +x.substring(a));
        
    }
    
}
