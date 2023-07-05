public class Main {
    public static void main(String[] args) {
        Zoo Madagascar = new Zoo(7, 14);

        //Criando animais
        Mamifero leao = new Mamifero("Alex", 9, 160, "Dançarino", "comprida");
        Ave papagaio = new Ave("Rico", 49, 2.4, "Gago", 2.4);
        Mamifero tigre = new Mamifero("Tigresa", 12, 200, "Pintada", "curta");

        //Adicionando animais ao zoologico
        Madagascar.AdicionarAnimal(leao);
        Madagascar.AdicionarAnimal(papagaio);
        Madagascar.AdicionarAnimal(tigre);

        //Criando funcionarios
        Veterinario joao = new Veterinario("João", "Veterinário", "Mamiferos", 5000);
        Veterinario tiago = new Veterinario("tiago", "Veterinario", "Aves", 6000);

        //Adicionando funcionarios ao zoologico
        Madagascar.AdicionarFuncionario(joao);
        Madagascar.AdicionarFuncionario(tiago);

        //Interagindo com animais

        leao.movimentar();
        leao.movimentar("Lentamente");
        tigre.Amamentar();
        papagaio.realizarTruque();
        papagaio.Voar();

        //Interagindo com veterinarios

        tiago.realizarExame(leao);
        joao.realizarExame(papagaio);


    }

}

// Propósito: Representa a classe principal onde é criado o programa principal.
// Método main(): É o ponto de entrada do programa, onde a execução começa.
// Criação de objetos: São criados objetos das classes Mamifero, Ave e Veterinario, representando animais e funcionários do zoológico.
// Instanciação do Zoo: É criado um objeto da classe Zoo, passando como argumentos o número máximo de animais e o número máximo de funcionários permitidos.
// Adição de animais e funcionários ao zoológico: Os objetos dos animais e funcionários criados são adicionados ao objeto Zoo utilizando os métodos AdicionarAnimal() e AdicionarFuncionario().
// Interação com os animais: São chamados os métodos movimentar(), movimentar(String modo), Amamentar(), realizarTruque() e Voar() nos objetos dos animais, para simular suas ações.
// Interação com os veterinários: São chamados os métodos realizarExame() nos objetos dos veterinários, passando como argumento os objetos dos animais, para simular a realização de exames veterinários.
// A herança é utilizada nas classes Mamifero, Ave e Veterinario, que herdam da classe Animal ou implementam a interface Treinavel.

// O polimorfismo é aplicado quando chamamos os métodos movimentar() e movimentar(String modo) nos objetos dos animais. O método chamado será aquele definido na classe específica de cada animal, permitindo que o comportamento seja polimórfico.