package poo_exercicio;


public class Circulo {
    private double x;
    private double y;
    private double raio;
    public Circulo (){ 
    }
    public Circulo (double x, double y,double raio){  
        this.x = x;
        this.y = y;
        this.raio = raio;
    }
    public double area (){
        return Math.PI * raio * raio;
    }
    public double perimetro(){
        return Math.PI*raio;
    }
    public double aumentaRaio(double p){
        this.raio = p+ raio;
        return raio;
    }
    public double diminuiRaio(double p){
        this.raio = raio-p;
        return raio;
    }
    public void compara (double raio){
        if (this.raio > raio){
            System.out.println("O raio original é maior");
        }else{
            System.out.println("O raio original não é maior");
            
        }
    }
    public void setX(double x){
        this.x=x;
    }
    public double getX(){
        return x;
    }
    public void setY(double Y){
        this.y=y;
    }
    public double getY(){
        return y;
    }
    public void setRaio(double raio){
        this.raio=raio;
    }
    public double getRaio(){
        return raio;
    }
    
    
    
}
