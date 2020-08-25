package Package_Java;

public class First_Method {
    
    //método principal utilizado  para executar outros métodos e outros paramêtros;
    public static void main(String []args){
        
        //executar o método - chamar o método;
        double resp = somaValor(20.55, 10.53);
        
        System.out.println("A soma é igual a: "+resp);
        
    }
    //criando um método com parâmentos e com retorno;
    public static double somaValor(double v1, double v2){
        
        return (v1+v2);
      
        //public static double somaValor(double v1, double v2) = assinatura do método;
    }
    
    //método sem parâmetro e sem retorno
    //método void - executa por si mesmo
    public static void somarValor(){
        
        double v1, v2, resp;
        v1 = 10.5;
        v2 = 10.5;
        resp = v1+v2;
        
        System.out.println("Somar valor = "+resp);
        
    }
    
        //método sem retorno mas com parâmetros
    public static void somandoValor(double v1, double v2){
        
        double resp = (v1+v2);
        
        System.out.println("Somando valor= "+resp);
        
    }
    
    public static String imprimeTexto(String texto){
        
        return texto;
        
    }
    
    public static void imprimirTexto(String texto){
        
        System.out.println("Texto impresso = "+texto);
        
    }
    
}
