/*→ Crie um objeto para cada tipo de funcionário e apresente os dados gerais dos 
mesmos bem como o salário a receber tendo em conta as imposições referidas 
acima.
→Os valores a passar para os métodos ou parâmetros devem ser solicitados ao 
utilizador (use a classe Scanner ou JOptionPane) */

import javax.swing.JOptionPane;

public class TestarFuncionarios_2 {
    
    public static void main(String[] args) {
        boolean continuar = true;
        

        while (continuar) {
        
            // Opções para o menu de seleção
            String[] opcoes = {"Vendedor", "Administrativo", "Financeiro", "Sair"};

            // Solicitar ao usuário que escolha o tipo de funcionário
            int escolha = JOptionPane.showOptionDialog(null, 
                    "Escolha o tipo de funcionário:", "Escolha do tipo de funcionário", 
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);     

            // Se escolher "Sair", sair do loop
            if (escolha == 3) {
                continuar = false;
            } else {
            
                // Solicitar os dados gerais dos funcionários
                String nome = JOptionPane.showInputDialog("Digite o nome do funcionário: ");
                String contactoMovel = JOptionPane.showInputDialog("Digite o contacto móvel do funcion�rio: ");
                String email = JOptionPane.showInputDialog("Digite o e-mail do funcionário: ");
                double salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário fixo do funcionário: "));

                // Criar objeto com base na escolha do usuário
                switch (escolha) {
                    case 0:
                        // Vendedor
                        Vendedores vendedor = new Vendedores(nome, contactoMovel, email, salarioFixo);
                        vendedor.dadosVendedores();
                        break;
                    case 1:
                        // Administrativo
                        Administrativos administrativo = new Administrativos(nome, contactoMovel, email, salarioFixo);
                        administrativo.dadosAdministrativos();
                        break;
                    case 2:
                        // Financeiro
                        Financeiros financeiro = new Financeiros(nome, contactoMovel, email, salarioFixo);
                        financeiro.dadosFinanceiros();
                        break;                
                    default: 
                        JOptionPane.showMessageDialog(null, "Escolha inválida!");
                }
            }   
        }
    }
}
