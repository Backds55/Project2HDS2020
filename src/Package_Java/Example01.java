package Package_Java;

public class Example01 {
   
    //método mais completo
    
    public static double somaValor(double v1, double v2){
    
        return (v1+v2);
    }
    
    //@método de acesso - acessar o método em qualquer lugar: public, private, protected:
    //+public - não necessita de autorização para utilizar o método;
    //-private - necessita de autorização para utilizar o método(utilizando o get() ou set();
    //#protected - necessita de autorização para utilizar o método(utilizando o get() ou set();
    
    //@Visibilidade - o método estará vísivel para toda a classe e todas as classes do pacote do projeto: (ex: static);
    
    //@Tipo de retorno - retornar o valor do tipo mencionado(tipo pode ser: double, float, string, int, char, boolean e outras variáveis);
    //Obrigatoriamente dentro do método terá que ter a palavra "return" e deverá retornar o mesmo tipo que foi declarado no retorno.
    
    //@Nome do método - nome que você deverá far ao método apresentado o qual será feito pela ação do mesmo (ex: somaValor);
    
    //@Parâmetros - servem para receber os valores que serão utilizados dentre do método. Simulando uma porta de entrada(ex:double v1, double v2);
    //obs: Se o tipo de retorno (ex: return) for igual a void, o método não devolverá nada somente executará;
   
    public static void subtrairValor(double v1, double v2){
        
        double resp = v1 + v2;
        System.out.println("A soma = "+resp);
        
    }
    //void significa em métodos - sem retorno
    
   
    
}
