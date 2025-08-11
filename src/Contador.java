import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidos {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int parametroUM = terminal.nextInt();

        System.out.println("Digite o segundo numero: ");
        int parametroDOIS = terminal.nextInt();

        try {
            contar(parametroUM, parametroDOIS);
            System.out.println("Contagem realizada com sucesso.");
        } catch (ParametrosInvalidos e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static void contar(int parametroUM, int parametroDOIS) throws ParametrosInvalidos {
        if (parametroUM  >  parametroDOIS) {
            throw new ParametrosInvalidos("O segundo parametro deve ser maior que o primeiro");
        }
        int contagem = parametroDOIS - parametroUM;
        for(int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
