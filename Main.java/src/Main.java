

public class Main {
   
    public static void main(String args[]) {


        Disciplina disciplina = new Disciplina();
        Geometrica geometrica = new Geometrica();
        Aritmetica aritmetica = new Aritmetica();
        
        
        disciplina.setNome( "Padroes de Desenvolvimento");
        disciplina.setP1(10); 
        disciplina.setP2(5);
       // disciplina.setSituacao();
        disciplina.setCalcMedia(aritmetica);

        



        System.out.println("P1:%.2f P2:%.2f Media:%.2f Situacao: %s",disciplina.getP1(), disciplina.getP2(),
         disciplina.Calculo(), disciplina.getSituacao());

           //"P1:%.2f P2:%.2f Media:%.2f Situacao: %s", disciplina.getP1(),disciplina.getP2(),disciplina.getCalcMedia(), disciplina.getSituacao()

    }
}