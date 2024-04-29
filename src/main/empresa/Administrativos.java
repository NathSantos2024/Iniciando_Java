/*Os administrativos têm um salário fixo, mas podem ganhar horas extras.
 Nos administrativos as horas extras são pagas a 3 euros à hora.*/

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Administrativos extends Funcionarios {
    // Atributo adicional da classe Administrativos
    private int horasExtras;

    // Construtor da classe Administrativos que recebe todos os atributos, 
    // incluindo os herdados de Funcionarios
    public Administrativos(String nome, String contactoMovel, String email, 
            double salarioFixo) {
        // Chama o construtor da classe Funcionarios
        super(nome, contactoMovel, email, salarioFixo);
        // Inicializa o atributo horas extras
        this.horasExtras = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite a quantidade de horas extras: "));
    }
    
    //M�todo para calcular o sal�rio total com as horas extras
    public double getSalarioTotal() {
        double salarioTotal = getSalarioFixo() + (horasExtras * 3);
        return salarioTotal;
    }
    
    public void dadosAdministrativos() {
        DecimalFormat df = new DecimalFormat("###,###,##0.00 Euros");
        String mensagem = "Nome: " + getNome() + "\n" +
                          "Contacto: " + getContactoMovel() + "\n" +
                          "Email: " + getEmail() + "\n" +
                          "Salário Total: " + df.format(getSalarioTotal());
        JOptionPane.showMessageDialog(null, mensagem);
    }

        
}
