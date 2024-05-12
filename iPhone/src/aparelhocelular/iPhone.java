package aparelhocelular;

import navegador.browser;
import playerdemusica.playerMusic;
import telefone.phoneApp;

public class iPhone {
    
    public static void main(String[] args) {
        
        playerMusic playapp = new playerMusic();
        playapp.selecionarMusica("Star boy");
        playapp.pausarMusica();
        playapp.tocarMusica();

        browser chrome = new browser();
        chrome.exibirPagina("google.com");
        chrome.adicionarNovaAba(2);
        chrome.atualizarPagina();

        phoneApp telApp = new phoneApp();
        telApp.atender();
        telApp.correioDeVoz();
        telApp.ligar("11956568456");



    }
}
