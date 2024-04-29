/*Os vendedores têm um salário base, mas ganham também comissão sobre as 
vendas.  
Os vendedores devem ter um método que imprima o seu salário total considerando 
que a comissão é de 5% sobre o valor das vendas.*/

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Vendedores extends Funcionarios {
    // Atributo adicional da classe Vendedores
    private double valorVendas;

    // Construtor da classe Vendedores que recebe todos os atributos, 
    // incluindo os herdados de Funcionarios
    public Vendedores(String nome, String contactoMovel, String email, 
            double salarioFixo) {
        // Chama o construtor da classe Funcionarios
        super(nome, contactoMovel, email, salarioFixo);
        // Inicializa o atributo valorVendas
        this.valorVendas = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o valor das vendas: "));
    }
    
    //M�todo para calcular o salário total do vendedor com a comiss�o
    public double getSalarioTotal() {
        return getSalarioFixo() + (0.05 * valorVendas);
    }
        
    public void dadosVendedores() {
        DecimalFormat df = new DecimalFormat("###,###,##0.00 Euros");
        String mensagem = "Nome: " + getNome() + "\n" +
                          "Contacto: " + getContactoMovel() + "\n" +
                          "Email: " + getEmail() + "\n" +
                          "Salário Total: " + df.format(getSalarioTotal());
        JOptionPane.showMessageDialog(null, mensagem);
    }

    
}