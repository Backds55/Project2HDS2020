package Package_Java;

public class First_Class {
    //declarando as variáveis globais - estão dentro da classe e fora dos métodos.
    double valor1,valor2, resultado=0;
    //método principal que executa a classe.
    
public static void main(String args[]){

    //System.out.println("Exemplo de uma classe em java");
    
    //SegundoExemplo.escrever();
    
    //Declarando as variáveis locais - porque estão dentro de um método
    int num1, num2, resp=0;
    double valor1,valor2, resultado=0;
    //Declaração de uma variável constante
    final double pi = 3.14161835;
    
    //Inicializar as variáveis
    //O símbolo de igual significa que está atribuindo valor
    
    
    num1 = 10;
    num2 = 20;
    //resp=0;//limpar o valor e colocar um valor
    //Realizar uma operação
    
    resp = num1 + num2;
    
    System.out.println("A soma é: "+resp);
    
    valor1=25;
    valor2=25;
    
    resultado = valor1 * valor2 * pi;
    
    System.out.println("O valor do resultado é: "+resultado);
}
    
}
