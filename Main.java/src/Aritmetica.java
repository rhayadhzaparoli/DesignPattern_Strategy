public class Aritmetica implements ICalcMedia{
    
    public double status;

    @Override
    public double CalculaMedia (double p1, double p2) {
        status =  p1 * p2 /2 ;       
         return status;
    }

   
    @Override
    public String Situacao(double status) {
        if (status >= 7) {
        return "Aprovado"; }
        else {
            return "Reprovado";
        }
    }
    
}
