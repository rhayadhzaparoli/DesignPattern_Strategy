public interface ICalcMedia {

    // Criando a Interface para uso do design pattern Strategy

    double calculaMedia(double p1, double p2); // traz a nota da p1 e p2 como parametro, declaradas na classe Disciplina
    String situacao(); // metodo para declarar se o aluno foi aprovado ou não
}
