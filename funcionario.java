public class funcionario {
    int codFunc;
    String nomeFunc;
    int codCargo;
    String enderecoFunc;
    String emailFunc;
    double salarioFunc;
    
    public funcionario () {

    }


public funcionario (int codF, String nome, double salario ) {

    codFunc = codF;
    nomeFunc = nome;
    salarioFunc = salario;

}

public funcionario (int codF, String nome, int codC, String end, String email, double salario){

    codFunc = codF;
    nomeFunc = nome;
    codCargo = codC;
    enderecoFunc = end;
    emailFunc = email;
    salarioFunc = salario;

}
}
