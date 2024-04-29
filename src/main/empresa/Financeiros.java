/*Os financeiros têm um salário fixo, mas podem ganhar um prémio de produtividade.
 o prémio mensal é variável.
 */


import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Financeiros extends Funcionarios {
    // Atributo adicional da classe Administrativos
    private final double premioProdutividade;

    // Construtor da classe Financeiros que recebe todos os atributos, 
    // incluindo os herdados de Funcionarios
    public Financeiros(String nome, String contactoMovel, String email, 
            double salarioFixo) {
        // Chama o construtor da classe Funcionarios
        super(nome, contactoMovel, email, salarioFixo);
        // Inicializa o atributo prêmio Produtividade
        this.premioProdutividade = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o valor do pr�mio de produtividade: "));
    }
    
    //Método para calcular o salário total com o double pr�mio de Produtividade
    public double getSalarioTotal() {
        return getSalarioFixo() + premioProdutividade;
    }
    
    public void dadosFinanceiros() {
        DecimalFormat df = new DecimalFormat("###,###,##0.00 Euros");
        String mensagem = "Nome: " + getNome() + "\n" +
                          "Contacto: " + getContactoMovel() + "\n" +
                          "Email: " + getEmail() + "\n" +
                          "Salário Total: " + df.format(getSalarioTotal());
        JOptionPane.showMessageDialog(null, mensagem);
    }

        
}
