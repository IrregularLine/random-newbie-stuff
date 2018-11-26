package poo_exercicio;



import java.util.Scanner;
public class ConstroiCirculo {
    public static void main(String[] args) {
        double x,x1,y,raio;
        Scanner leia = new Scanner(System.in);
        System.out.println("Insira as cordenadas do centro " );
        x1 = leia.nextDouble();
        System.out.println("Insira as cordenadas do centro " );
        y = leia.nextDouble();
        System.out.println("Insira o valor do raio ");
        raio = leia.nextDouble();
        Circulo c = new Circulo(x1,y,raio);
        System.out.println("area = "+ c.area());
        System.out.println("Perimetro = "+c.perimetro());
        System.out.println("Coordenadas = ("+ x1 + ", "+ y+")");
        System.out.println("Diga o valor em que quer aumentar o raio");
        x = leia.nextDouble();
        x = c.aumentaRaio(x);
        System.out.println("O raio aumentou para :" + x);
        System.out.println("Diga o valor em que quer diminuir o raio");
        x = leia.nextDouble();
        x = c.diminuiRaio(x);
        System.out.println("O raio diminui para :" + x);  
        System.out.println("Insira um valor para comparar com o raio atual");
        x = leia.nextDouble();
        c.compara(x);
        
    }
} 