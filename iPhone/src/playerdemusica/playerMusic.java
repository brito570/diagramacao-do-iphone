package playerdemusica;

public class playerMusic {
    
    private String musica = "";

    public void tocarMusica(){
        System.out.println("Reproduzindo " + musica);
    }

    public void pausarMusica (){
        System.out.println("Pausando " + musica);
    }

    public void selecionarMusica (String musica){
        this.musica = musica;
        System.out.println("Musica selecionada!");
        tocarMusica();
    }


}
