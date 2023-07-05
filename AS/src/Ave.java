public class Ave extends Animal implements Treinavel{

    private double invergaduraAsa;

    public Ave(String nome, int idade, double peso, String especie, double invergaduraAsa)
    {
        super(nome, idade, peso, especie);
        this.invergaduraAsa=invergaduraAsa;
    }

    public void Voar()
    {
        System.out.println("A ave "+getNome()+" está voando");
    }


    @Override
    public void realizarTruque() {
        System.out.println("A ave "+getNome()+" realizou um truque voador");
    }
}


// Propósito: Representa a classe para aves, que é uma subclasse de Animal e implementa a interface Treinavel.
// Atributo: Possui um atributo específico para aves, invergaduraAsa, que armazena a envergadura das asas da ave.
// Construtor: Inicializa os atributos da ave, bem como os atributos herdados da classe Animal, através do construtor da superclasse.
// Método Voar(): Imprime uma mensagem indicando que a ave está voando.
// Método realizarTruque() (implementado da interface Treinavel): Imprime uma mensagem indicando que a ave realizou um truque voador.
// A herança é utilizada pela classe Ave ao estender a classe Animal. Isso permite que a classe Ave herde os atributos e métodos da classe Animal, como nome, idade, peso, espécie e os métodos getter e setter correspondentes.

// O polimorfismo é evidenciado pela implementação do método realizarTruque(), que é definido pela interface Treinavel. Ao implementar esse método na classe Ave, a ave pode ser tratada como um objeto do tipo Treinavel, permitindo que ela seja treinada e execute um truque específico para aves.