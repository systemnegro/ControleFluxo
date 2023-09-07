
# Criando uma Exceção Personalizada em Java

Este repositório contém um exemplo simples em Java que o objetivo é praticar a criação de uma exceção personalizada. O código envolve a contagem de números a partir de dois parâmetros fornecidos pelo usuário e lança a exceção personalizada `InvalidParametersException` quando o segundo parâmetro é menor que o primeiro.


## O código consiste em duas classes principais

### Contador.java

Esta classe é a classe principal que contém o método `main`. Ela é responsável por receber dois parâmetros do usuário e chamar o método `contar`. Uma exceção é lançada se o segundo parâmetro for menor que o primeiro.

### InvalidParametersException.java

Esta é uma classe de exceção personalizada que estende a classe `Exception`. Ela é lançada na classe `Contador` quando os parâmetros são inválidos.

### Método `contar`

O método `contar` realiza a contagem entre os dois parâmetros fornecidos e lança a exceção personalizada `InvalidParametersException` se o primeiro parâmetro for maior que o segundo. Caso contrário, ele realiza a contagem e imprime os números na sequência.
