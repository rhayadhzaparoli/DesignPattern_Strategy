public class Aritmetica implements ICalcMedia{
    
    public double status;


    @Override
    public double CalculaMedia (double p1, double p2) {
        status =  p1 * p2 /2 ;       
         return status;
    }

   
    @Override
    public String Situacao (double status) {
        if (status >= 6) {
            System.out.println("Aprovado"); 
        }  else {
            System.out.println("Reprovado");

        }
    }
    
}
