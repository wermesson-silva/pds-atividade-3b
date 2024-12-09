
public class App {
    public static void main(String[] args) {
        // Criando uma instância de Pessoa para cada estuantes
        Pessoa pessoa = new Pessoa("Daniel", 25);

        // Exibindo as informações dos estudantes
        pessoa.exibirInformacoes();
        
        Pessoa pessoa2 = new Pessoa("Wermesson", 19);
        pessoa2.exibirInformacoes();
    }
}
