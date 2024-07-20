public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T"; //B / T

        switch (plano) {
            case "T": {
                System.out.println("5GB Youtube");
            }
            case "M":{
                System.out.println("WhatsApp e Instagram gratuitos!");

            }
            case "B":{
                System.out.println("100 Minutos de ligação.");
            }
        }
    }
}

// não foi usado o break pois foi aproveitado as informações