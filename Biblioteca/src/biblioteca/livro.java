package biblioteca;

public class livro {
   private String titulo;
   private int ano;
   private int iespn;
   private double  qtdPaginas;
   private String editora;
   private  double valor;
    
    public String getTitulo(String titulo){
       return this.titulo();
    }
    public void setTitulo(){   
        this.titulo = titulo;
    }
    
    public int getAno(int ano){
        return this.ano();
    }
    public void setAno(){ 
        this.ano = ano;
    }
    
    public int getIESPN(int iespn){
        return this.iespn();
    }
    public void setIESPN(){
        this.iespn = iespn;
    }
    
    public double getQTDpaginas(double qtdpaginas){
        return this.qtdPaginas();
    }   
    public void setQTDpaginas(){
       this.qtdPaginas = qtdPaginas;
    } 
    
    public String getEditora(String editora){
        return this.editora();
    }
    public void setEditora(){
        this.editora = editora;
    }
    
    public double getValor(double valor){
        return this.valor();
    }
    public void setValor(){
        this.valor = valor;
    }
    
    public String exibir(){
        System.out.println("Titulo:");
        System.out.println("ANO:");
        System.out.println("IESPN:");
        System.out.println("QTDpaginas:");
        System.out.println("Editora:");
        System.out.println("Valor:");
        return this.exibir();      
    }
    
    public Double Venda(int quantidade){
        
        return valor*quantidade; 
    }
    
    

    private String editora() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String titulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int ano() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int iespn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private double qtdPaginas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private double valor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
