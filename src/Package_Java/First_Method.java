package Package_Java;

public class First_Method {
    
    //método principal utilizado  para executar outros métodos e outros paramêtros;
    public static void main(String []args){
        
        //executar o método - chamar o método;
        double resp = somaValor(10.5, 10.5);
        
        System.out.println("A soma é igual a: "+resp);
        
    }
    //criando um método com parâmentos e com retorno;
    public static double somaValor(double v1, double v2){
        
        return (v1+v2);
      
        //public static double somaValor(double v1, double v2) = assinatura do método;
    }
    
}
