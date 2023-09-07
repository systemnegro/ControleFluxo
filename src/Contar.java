public class Contar {
    static void contar(int parameter1, int parameter2 ) throws InvalidParametersException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parameter1 > parameter2){
            throw new InvalidParametersException();
        }

        int contagem = parameter2 - parameter1;
        //realizar o for para imprimir os números com base na variável contagem
        for (int aux = 1; aux <= contagem; aux++ ){
            System.out.println(aux);
        }
    }
}
