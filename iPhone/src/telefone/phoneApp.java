package telefone;

public class phoneApp {


    private String numeroTelefone = "";

    public void ligar(String numeroTelefone){
        this.numeroTelefone = numeroTelefone;
        
        System.out.println("Ligando para " + numeroTelefone + "...");
    }

    public void atender (){
        System.out.println("Ligação atendida");
    }

    public void correioDeVoz(){
        System.out.println("Tocando correio de voz");
    }

    
}
