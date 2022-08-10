import javax.swing.JOptionPane;

public class exerc3 {

    public static void main(String[] args) {
    
    funcionario f1 = new funcionario();
    Cargo c1 = new Cargo(0, null);
    
    f1.nomeFunc = JOptionPane.showInputDialog("Digite o nome do Funcionario ?");
    f1.emailFunc =JOptionPane.showInputDialog("Digite o Email do Funcionario ?");
    f1.enderecoFunc = JOptionPane.showInputDialog("Digite o Endereço do Funcionario ?");
    f1.codCargo = Integer.parseInt(JOptionPane.showInputDialog("Digite o Codigo do Cargo ?"));
    f1.codFunc = Integer.parseInt(JOptionPane.showInputDialog("Digite o Codigo do Funcionario ?"));
    f1.salarioFunc = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do Funcionario ?"));
    
    c1.nomeCargo = JOptionPane.showInputDialog("Digite o nome do Cargo do Cliente: ");
    c1.codCargo = Integer.parseInt(JOptionPane.showInputDialog("Digite o Codigo do Cargo: "));
    c1.cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Digite a Carga de Horaria do Funcionario: "));

    JOptionPane.showMessageDialog(null,      
        "Os dados Cadastrado do Funcionario: \n\tNome do Funcionario é :"         +f1.nomeFunc+ 
                                            "\n\t E-mail Do Funcionario é : "     +f1.emailFunc+
                                            "\n\t Endereço do Funcionario é : "   +f1.enderecoFunc+
                                            "\n\t O Codigo do Cargo é : "         +f1.codCargo+
                                            "\n\t O codigo do Funcionario é : "   +f1.codFunc+
                                            "\n\t O Salário do Funcionario é : "  +f1.salarioFunc  );  
                                        



   JOptionPane.showMessageDialog(null,
    "Os Dados Sobre o Cargo do Funcionario: \n\tO Nome do Cargo do Funcionario é :  "    +c1.nomeCargo+
                                            "\n\t O Codigo do Funcionario é :  "         +c1.codCargo+
                                            "\n\t A Carga Horaria do Funcionario é :  "  +c1.cargaHoraria);

   }

}
