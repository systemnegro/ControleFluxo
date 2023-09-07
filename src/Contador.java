import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parameter1 = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parameter2 = scanner.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            Contar.contar(parameter1, parameter2);

        }catch (InvalidParametersException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

}