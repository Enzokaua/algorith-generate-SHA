import java.util.Scanner;

public class App {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static String TIPO_CHAVE_SHA;
    private static String MENSAGEM;

    public static void main(String[] args) throws Exception {
        System.out.println("Este é o algoritmo que gera chaves SHA." +
                "\n Chaves SHA geram uma saída Hash, esse hash é único para cada entrada, ou seja, pequenas mudanças mudam o Hash." +
                "\n Esse é o modelo que o git por exemplo utiliza nos Headers dos seus commits, blobs e até a estrutura de diretórios." +
                "\n Agora sem mais enrolação, vamos gerar estes algoritmos, Digite qual tipo de SHA deseja entrar. SHA-1, SHA-2 ou SHA-3? ");
        TIPO_CHAVE_SHA = SCANNER.nextLine();

        System.out.println("Certo, agora digite a palavra que deseja codificar: ");
        MENSAGEM = SCANNER.nextLine();
        Utils.geraChaveSha(TIPO_CHAVE_SHA, MENSAGEM);

    }
}
