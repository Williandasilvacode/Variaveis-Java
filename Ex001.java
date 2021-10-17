import javax.print.event.PrintJobListener;

//<---- Exemplo de variável do tipo "String"----->

//crie uma variável chamada 'nome' do tipo "String" e atribua a ela o valor "John"

/*
public class Ex001{
    public static void main(String[] args) {
        String nome = "john";
        System.out.println(nome);
    }
}
*/

      //<----Exemplo de variável do tipo "Int" ---->//

// Crie uma variável chamada 'meuNumero' do tipo 'Int' e atribua a ela o valor 15:

/*
public class Ex001 {
    public static void main(String[] args) {
        int meuNumero = 15;
        System.out.println(meuNumero);
    }
    
}
*/
// Voce também pode declarar uma variável sem atribuir o valor e atribuir o valor posteriormente:

// Exemplo:
/*
 public class Ex001{
     public static void main(String[] args) {
         int meuNumero;
         meuNumero = 15;
         System.out.println(meuNumero);

     }
 }
*/

//Observe que se voce atribuir um novo valor a uma variável existente, ele substituirá o valor anterior:

// Exemplo:
//Alterar o valorna variável 'meuNumero' de 15 para 20.

/*
public class Ex001{
    public static void main(String[] args) {
        int meuNumero = 15;
        meuNumero = 20;  //meuNUmero agora tem 20
        System.out.println(meuNumero);
    }
}
*/

            // <--- Variáveis Finais ---->

/*No entanto, voce pode adicionar a 'final' palavra - chave se não quiser que outras pessoas (ou voce mesmo) substituam os valores existentes (isso declarará a variável como 'final ou 'constante', o que significa imutável e somente leitura) */

/*
public class Ex001{
    public static void main(String[] args) {
        final int meuNumero = 15;
        meuNumero = 20;  //irá gerar um erro
        System.out.println(meuNumero);
    }
}
*/

       //<---Variáveis de exibição----->

    //Ex.


    /*
    public class Ex001{
        public static void main(String[] args) {
            String nome ="John";
            System.out.println("Olá " + nome);
        }
    }
    */

    public class Ex001{
        public static void main(String[] args) {
            String nome = "Willian ";
            String SobreNome = "Silva";
            String NomeCompleto = nome + SobreNome;
            System.out.println(NomeCompleto);

        }
    }





