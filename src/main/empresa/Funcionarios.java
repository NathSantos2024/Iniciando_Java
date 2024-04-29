public class Funcionarios {
    // Atributos
    private String nome;
    private String contactoMovel;
    private String email;
    private double salarioFixo;

    // Construtores
    public Funcionarios(String nome, String contactoMovel, String email, double salarioFixo) {
        this.nome = nome;
        this.contactoMovel = contactoMovel;
        this.email = email;
        this.salarioFixo = salarioFixo;
    }

    // M�todos Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContactoMovel() {
        return contactoMovel;
    }

    public void setContactoMovel(String contactoMovel) {
        this.contactoMovel = contactoMovel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
}
