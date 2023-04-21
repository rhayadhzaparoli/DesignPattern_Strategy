public class Disciplina {
    //Classe para declaração de atributos e metodos

    //Atributos
    private ICalcMedia calcMedia;
    private String nome; 
    private double p1;
    private double p2;
    
    // Setters
    public void setCalcMedia(ICalcMedia calcMedia) {
        this.calcMedia = calcMedia;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setP1(double p1) {
        this.p1 = p1;
    }
    
    public void setP2(double p2) {
        this.p2 = p2;
    }
       
    
    //Getters
    public String getNome() {
        return nome;
    }
    
    public double getP1() {
        return p1;
    }
    
    public double getP2() {
        return p2;
    }
    
    public String getSituacao() {
        return this.calcMedia.situacao(); // nesse retorno é pego com this da interface calcMadia traz situacao
    }

    // Metodo getado da interface
    public double calculaMedia() {
        return this.calcMedia.calculaMedia(this.p1, this.p2); // nesse retorno é pego com this da interface calcMadia traz situacao com parametros getados anteriormente na p1 e p2
    }
    
    
}
