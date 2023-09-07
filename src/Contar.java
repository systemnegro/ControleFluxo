public class Contar {
    static void contar(int parameter1, int parameter2 ) throws InvalidParametersException {
        //validar se parameter1 é MAIOR que parameter2 e lançar a exceção
        if (parameter1 > parameter2){
            throw new InvalidParametersException();
        }

        int counting  = parameter2 - parameter1;
        //realizar o for para imprimir os números
        for (int x = 1; x <= counting ; x++ ){
            System.out.println(x);
        }
    }
}
