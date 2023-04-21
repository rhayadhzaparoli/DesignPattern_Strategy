public class Main {
   
    public static void main(String args[]) {

        // instancias 
        Disciplina disciplina = new Disciplina();
        Aritmetica aritmetica = new Aritmetica();
        Geometrica geometrica = new Geometrica();

        // instacia com sets e valores de uso
        disciplina.setNome("Padroes de Desenvolvimento");
        disciplina.setP1(10); 
        disciplina.setP2(5);
        disciplina.setCalcMedia(geometrica);
        
        // output no console
        System.out.println("Nome: " +  disciplina.getNome());
        System.out.println("P1: " +  disciplina.getP1());
        System.out.println("P2: " + disciplina.getP2());
        System.out.println("Media: " + disciplina.calculaMedia()); 
        System.out.println("Situacao: " + disciplina.getSituacao()); 
    }
}