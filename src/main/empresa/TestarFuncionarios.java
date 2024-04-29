/*Crie uma classe TestarFuncionarios que possua um método main para testar as 
classes criadas:
→ Crie um objeto para cada tipo de funcionário e apresente os dados gerais dos 
mesmos bem como o salário a receber tendo em conta as imposições referidas 
acima. */

public class TestarFuncionarios {
    
    public static void main(String[] args) {
        
        // Criando um objeto Vendedor
        Vendedores vendedor = new Vendedores("João", "999999999", "joao@exemplo.com", 1200.0);
        // Apresentando os dados gerais e o salário a receber
        vendedor.dadosVendedores();

        // Criando um objeto Administrativo
        Administrativos administrativo = new Administrativos("Maria", "888888888", "maria@exemplo.com", 1300.0);
        // Apresentando os dados gerais e o salário a receber
        administrativo.dadosAdministrativos();

        // Criando um objeto Financeiro
        Financeiros financeiro = new Financeiros("José", "777777777", "jose@exemplo.com", 1500.0);
        // Apresentando os dados gerais e o salário a receber
        financeiro.dadosFinanceiros();
    }
}

