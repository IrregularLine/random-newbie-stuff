/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4330diogoalmeidateste;

import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
        int ano_n, idade = 0,o = 0, flag = 0;
        Scanner leia = new Scanner(System.in);
        do{
            System.out.println("1 -Insira o ano do seu nascimento");
            System.out.println("2 - Benjamins");
            System.out.println("3 - Infantis");
            System.out.println("4 - Iniciados");
            System.out.println("5 - Juvenis");
            System.out.println("6 - Juniores");
            System.out.println("7 - Seniores");
            System.out.println("8 - Sair");
            o = leia.nextInt();
            switch (o){
                case (1):
                    System.out.println("A sua data de nascimento é : ");
                    ano_n = leia.nextInt();
                    idade = 2018- ano_n;
                    flag = 1;
                    break;
                case (2):
                    if (flag == 1 ){
                        if (idade >= 7 && idade <=11){
                            System.out.println("Escalão correto!");
                        }else{
                            System.out.println("Escalão incorreto!");
                        }
                    }else{
                        System.out.println("Insira o seu ano de nascimento 1º");
                    }
                    break;
                case (3):
                    if (flag == 1 ){
                        if (idade >= 12 && idade <=13){
                            System.out.println("Escalão correto!");
                        }else{
                            System.out.println("Escalão incorreto!");
                        }
                    }else{
                        System.out.println("Insira o seu ano de nascimento 1º");
                    }
                    break;
                case (4):
                    if (flag == 1 ){
                        if (idade >= 14 && idade <=15){
                            System.out.println("Escalão correto!");
                        }else{
                            System.out.println("Escalão incorreto!");
                        }
                    }else{
                        System.out.println("Insira o seu ano de nascimento 1º");
                    }
                    break;
                case (5):
                    if (flag == 1 ){
                        if (idade >= 16 && idade <=17){
                            System.out.println("Escalão correto!");
                        }else{
                            System.out.println("Escalão incorreto!");
                        }
                    }else{
                        System.out.println("Insira o seu ano de nascimento 1º");
                    }
                    break;
                case (6):
                    if (flag == 1 ){
                        if (idade >= 18 && idade <=19){
                            System.out.println("Escalão correto!");
                        }else{
                            System.out.println("Escalão incorreto!");
                        }
                    }else{
                        System.out.println("Insira o seu ano de nascimento 1º");
                    }
                    break;
                case (7):
                    if (flag == 1 ){
                        if (idade >= 20){
                            if(idade >= 35 && idade <= 44){
                                System.out.println("Escalão correto -M35");
                            }else if (idade >=45 && idade <=54){
                                System.out.println("Escalão correto -M45");
                            }else if (idade >= 55 && idade <=64){
                                System.out.println("Escalão correto -M55");
                            }else if (idade >= 65){
                                System.out.println("Escalão correto -M65");
                            }else{
                                System.out.println("Escalão correto!");
                            }
                        }else{
                            System.out.println("Escalão incorreto!");
                        }
                    }else{
                        System.out.println("Insira o seu ano de nascimento 1º");
                    }
                    break;
                case (8):
                    break;
                default :
                    System.out.println("Inseriu uma opção incorreta");
            }
        }while (o!= 8);
    }
    
}
