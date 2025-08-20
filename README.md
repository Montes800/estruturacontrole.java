Estudo de Estruturas Condicionais em Java 🧐


E aí, galera! 👋 Esse repositório é pra quem quer dar um up no jogo de lógica em Java. Aqui a gente explora as duas formas mais comuns de tomar decisões no código: a clássica estrutura if-else e o atalho super esperto que é o operador ternário (?:).

O objetivo é mostrar como a mesma lógica pode ser escrita de um jeito mais "old school" ou de um jeito mais "clean code". Bora codar! 🚀

Conceitos Abordados 🧠
if-else (O Clássico) 🤓
É a forma mais tradicional de criar caminhos no seu código. Tipo um "se isso, faça aquilo; se não, faça outra coisa". É perfeito pra lógicas mais complexas com vários "e se..." na história.

Operador Ternário (?:) ✨
O atalho genial! É um if-else em uma só linha, super útil pra quando você precisa definir o valor de uma variável com base em uma condição simples. Deixa o código mais enxuto e elegante.

Sintaxe: condicao ? valor_se_verdadeiro : valor_se_falso;

Lógica Booleana (&& e ||) 🤔
Esses são os conectores da sua lógica! O && (AND) só é verdadeiro se todas as condições forem verdadeiras. O || (OR) é verdadeiro se pelo menos uma condição for verdadeira. Eles ajudam a criar condições super poderosas!

Entrada de Dados (Scanner) ⌨️
Pra completar, o código mostra como interagir com o usuário, pedindo informações no console usando a classe Scanner.

Exemplo de Código 💻
Dá uma olhada nos dois jeitos de fazer a mesma coisa (descobrir se alguém pode dirigir):

Lógica if-else (no código, está comentado)

Java

if (age >= 18) {
    System.out.printf("%s tem %s anos, voce pode dirigir\n", name, age);
} else if (age >= 16 && isEmancipated) {
    System.out.printf("%s, apesar de voce ter %s anos, voce e emancipado e pode dirigir \n", name, age);
} else {
    System.out.printf("%s, voce nao pode dirigir \n", name);
}
Lógica com Operador Ternário (Ativo)

Java

var canDrive = (age >= 18) || (age >= 16 && isEmancipated);

var message = canDrive ?
    name + ", voce pode dirigir" :
    name + ", voce nao pode dirigir \n";

System.out.println(message);
Como Rodar 🕹️
Pra rodar, é moleza! Você só precisa ter o Java Development Kit (JDK) instalado.

Compile o arquivo:

Bash

javac ifelse.java
Execute o programa:

Bash

java ifelse
Aí é só seguir as instruções no console! 😉
