import java.util.Scanner; // Importa a classe Scanner para ler entrada do usuário.

public class ForExample { // Declara a classe principal do programa.
    public static void main(String[] args) { // O método 'main' é o ponto de entrada do programa.
        
        // --- Processo de Leitura (Incompleto) ---
        var scanner = new Scanner(System.in); // Cria um objeto 'Scanner' para ler dados, mas não é usado no código ativo.
        
        /*
        // --- Processo 1: Loop Infinito (Comentado) ---
        // Este é um loop infinito que só termina quando o usuário digita "exit".
        for (;;) { // O loop 'for' sem condições é um loop infinito.
            
            System.out.println("Digite um nome"); // Imprime uma mensagem pedindo um nome.
            var name = scanner.next(); // Lê a próxima palavra digitada pelo usuário.

            if (name.equalsIgnoreCase("exit")) break; // Se o nome for "exit" (ignorando maiúsculas), o loop é encerrado com 'break'.

            System.out.println(name); // Imprime o nome digitado.
        }
        */
        
        // --- Processo 2: Loop Principal (Com Erros de Lógica e de Sintaxe) ---
        var ii = 2; // Declara uma variável 'ii' com valor 2. Essa variável não é utilizada em nenhum lugar do código.
        
        // Início do loop 'for'. O loop irá iterar com a variável 'i' de 1 até 99.
        for (var i = 1; i < 100; i++) 
            // A condição 'i < 100' do loop faz com que o loop pare antes de 'i' chegar a 100.
            // Por isso, o bloco 'if' abaixo nunca será executado, pois 'i == 100' nunca será verdadeiro.
            if (i == 100){ 
                System.out.println("Fim"); // Esta linha nunca será impressa.
                break; // O 'break' nunca será executado.
            }
        
        // Este bloco de código NÃO está dentro do loop 'for' por falta de chaves {}
        {
            // O código nesta linha irá causar um ERRO de compilação, pois a variável 'i'
            // só existe dentro do escopo do loop 'for' e não pode ser acessada aqui.
            System.out.println(i); 
        }

    } // Fim do método 'main'.
} // Fim da classe 'ForExample'.