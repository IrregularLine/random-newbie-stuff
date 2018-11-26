package vetor.de.n.inteiros;
import java.util.Scanner;
public class VetorDeNInteiros {  
    public static void main(String[] args) {
        int n=0,p=0,c =0;
        System.out.println("Qual a dimensão do vetor?");
        Scanner leia = new Scanner (System.in);
        n = leia.nextInt();
        int v[] = new int[n];
        while (c <= n-1){
            System.out.println("Insira " + (n-c) + " valores");
            p = leia.nextInt();
            v[c] = p;
            c++;
        }
        System.out.println();
        maior (v,n);
        print (v,n);
        inverso (v,n);
        media (v, n);    
    }
    public static void print(int v[], int n){
        int c = 0,soma1 = 0;
       System.out.println("vetor : ");
        while (c <= n-1){
            
            System.out.print(" " +v[c]);
            c++;
        }
        System.out.println();
    }
    public static void media(int v[], double n){
        int c = 0,soma1 = 0;
        while (c <= n-1){
            soma1 = soma1 + v[c];
            c++;
        }
        System.out.println("media = "+soma1/n);
    }
    public static void maior(int v[], int n){
        int c = 0,maior = v[0];
        while (c <= n-1){
            if (v[c]> maior){
                maior = v[c];
            }
            c++;
        }
        System.out.println("maior numero do vetor = "+maior);
    }
    public static void inverso (int v[], int n){
        int c = 0;
        n--;
        System.out.println("vetor inverso : ");
        while (c<= n){
            
            System.out.print(" " +v[n-c]);
            c++;
        }
        System.out.println();
    }
} 