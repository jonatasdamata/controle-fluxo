import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0 ){
            Double valorDoce = valorAleatrio();

            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: R$" + valorDoce + " Adicionado no carrinho!");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: R$" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesda em doces!");
        
    }

    private static double valorAleatrio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
