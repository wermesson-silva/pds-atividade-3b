# pds-atividade-3b
IFRN/JC - PDS - Atividade do 3º bimestre

### Instruções

1. Realize o fork deste repositório para a sua conta do GitHub;
2. Na sua conta, clone para a sua máquina local o seu repositório forqueado;
3. Dentro do repositório, crie um projeto java como representado a seguir:

```
Atividade/
├── src/
│   ├── App.java
│   ├── Pessoa.java
```
onde as classes `App.java` e `Pessoa.java` são:

```java
public class Pessoa {
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}
```

```java
public class App {
    public static void main(String[] args) {
        // Criando uma instância de Pessoa para cada estuantes
        Pessoa pessoa = new Pessoa("Daniel", 25);

        // Exibindo as informações dos estudantes
        pessoa.exibirInformacoes();
    }
}
```

4. Complete o código da classe `App.java` para adicionar o nome COMPLETO de todos os integrantes, caso tenha mais do que 1;
5. Com o projeto criado e todos os arquivos salvos, adicione todo o projeto ao Staging Area;
6. Crie um commit com a mensagem `"Projeto Pronto!"`;
7. Realize o envio das alterações para o repositório remoto;
8. Envie o link do seu repositório para o SUAP, informando todos os integrantes no campo de comentário.
