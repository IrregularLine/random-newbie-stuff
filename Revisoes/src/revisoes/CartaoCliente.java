package revisoes;
public class CartaoCliente {
    private int n_cartao;
    private String titular;
    private int n_pontos;
    
    
    
    public CartaoCliente(int n_cartao, String titular) {
        this.n_cartao = n_cartao;
        this.titular = titular;
        n_pontos = 0;
    }

    public CartaoCliente() {
        n_cartao = 0;
        titular ="";
        n_pontos = 0;
    }
    
    public void mexe(){
        
    }
            
    public void mostraPontos(){
        System.out.println("Nº Total de pontos: "+ n_pontos);
    }

    @Override
    public String toString() {
        return "CartaoCliente{" + "n_cartao=" + n_cartao + ", titular=" + titular + ", n_pontos=" + n_pontos + '}';
    }

    
    
    public void creditar(int n_pontos){
        this.n_pontos = n_pontos;
    }
    
    public void debitar(int pontos){
        n_pontos = n_pontos - pontos;
    }
    
    public void transfere(CartaoCliente p){
        int x = p.getN_pontos();
        this.n_pontos = this.n_pontos+ p.n_pontos;
        p.subtrai(x);
    }
    
    public void subtrai(int x){
        n_pontos = n_pontos -x;
    }

    public int getN_cartao() {
        return n_cartao;
    }

    public void setN_cartao(int n_cartao) {
        this.n_cartao = n_cartao;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getN_pontos() {
        return n_pontos;
    }

    public void setN_pontos(int n_pontos) {
        this.n_pontos = n_pontos;
    }
    
}
