public abstract class Animal {

    private String nome;
    private int idade;
    private double peso;
    private String especie;

    public Animal(String nome, int idade, double peso, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void movimentar()
    {
        System.out.println("O animal "+getNome()+" se moveu naturalmente");
    }

    public void movimentar(String modo)
    {
        System.out.println("O animal "+getNome()+" se moveu de maneira especifica: "+modo);
    }



}



// Propósito: Representa a classe base abstrata para todos os animais.
// Atributos: Possui atributos como nome, idade, peso e espécie, para armazenar informações específicas de um animal.
// Construtor: Inicializa os atributos do animal com os valores passados como parâmetros.
// Métodos:
// Getter e Setter: Permitem acessar e modificar os atributos do animal.
// movimentar(): Imprime uma mensagem padrão sobre o animal se movendo naturalmente.
// movimentar(String modo): Imprime uma mensagem específica sobre o animal se movendo de uma maneira específica, de acordo com o modo passado como parâmetro.
// A herança é utilizada através da declaração da classe Animal como abstrata. Isso indica que ela serve como uma classe base para outras classes derivadas, permitindo que essas classes herdem seus atributos e métodos.