public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            if(numero == 3)
              continue;

            System.out.println(numero);
        }
    }
}


// break -> ele para na interaão. para no número.
//continue -> ele muda o fluxo daquela interação, pula este número e segue o fluxo.