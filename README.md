# Variaveis-Java
  Variaveis sao conteineres para armazenar valores de dados.

 Em Java, existem diferentes tipos de variaveis, por exemplo:

 ### String:
 armazena texto, como "Olá". Os valores da 'sting' estao entre aspas duplas.
 ### Int:
 armazena inteiros (numeros inteiros), sem decimais, como 123 ou -123.

 ### Float:
 armazena números de flutuante, com decimais, como 19,99 ou -19,99.

 ### Char:
 armazena caracteres unicos, como 'a' ou 'b'. Os valores dos caracteres sao colocados entre aspas simples.

 ### Boolean:
 armazena valores com dois estados: true(verdadeiro) ou False(falso).

 ### Declarando(criando) variáveis:
 Para criar uma variável, voce deve especificar o tipo e atribuir um valor a ela:

## Variáveis de exibição:
O println() método é frequentimente usado para exibir variáveis.
Para combinar texto e variável, use o caractere: +

#### Exemplo:

    public class Ex001{
        public static void main(String[] args) {
            String nome ="John";
            System.out.println("Olá " + nome);
        }
    }
resultado: Olá John


Voce também pode usar o caractere + para adicionar uma variável a outra variável:

#### Exemplo:

    public class Ex001{
        public static void main(String[] args) {
            String nome = "Willian ";
            String SobreNome = "Silva";
            String NomeCompleto = nome + SobreNome;
            System.out.println(NomeCompleto);

        }
    }
Resultado: Willian Silva


Para valores numéricos, o caractere funciona como um operador matemático (observe que usamos 'int' variáveis (inteiras) aqui):

#### Exemplo:

    public class Ex001{
        public static void main(String[] args) {
            int x = 4;
            int y = 6;
            System.out.println(x + y);  //imprime a soma de x + y
        }
    }

A partir do exemplo acima, voce pode esperar:

x armazena o valor: 4
y armazena o valor: 6

Em seguida, usamos o println() método para exibir a soma de x + y, que é 10.



