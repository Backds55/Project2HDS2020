package Package_Java;

public class Test_Class {
   
    
    //criando um método com parâmetros e com retorno;
    public static void main(String args[]){
        
        //para executar um método de outra classe segue:
        double resp = First_Method.somaValor(20.55, 10.53);
        
        System.out.println("A soma dos dois é = "+resp);
        
        //retornando da classe First_Method;
        First_Method.somarValor();
        
        First_Method.somandoValor(31.50, 21.50);
        
        String resposta = First_Method.imprimeTexto("Hello World");
        System.out.println("Texto retornado = ."+resposta);
        
        First_Method.imprimirTexto("Etecia");
        
    }
        
    
}
