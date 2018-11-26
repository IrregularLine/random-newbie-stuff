package pirâmide.de.números;
import java.util.Scanner;
public class PirâmideDeNúmeros {
    public static void main(String[] args) {
        int n,linhas =1, espaco=1,contador=1,num=1;
        Scanner leia = new Scanner(System.in);
        System.out.println("Escolha um número de 1 a 9");
        n = leia.nextInt();
        while (n >9 || n<1){
         System.out.println("Escolheu um número que não pertence à lista de números.");
         System.out.println("Escolha um número de 1 a 9.");
         n = leia.nextInt();
        }
        while (linhas <= n){
            while (espaco < n){
                System.out.print("  ");
                espaco ++;
            }
            while (num <= contador){
                System.out.print(num+ " ");
                num ++;
            }
            num --;
            while (num > 1){
                System.out.print(num-1+" ");
                num --;
            }
            num = 1;
            System.out.println();
            contador ++;
            espaco = contador;
            linhas ++;
        }
    }
}