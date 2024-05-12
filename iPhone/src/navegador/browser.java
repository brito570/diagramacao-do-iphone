package navegador;

public class browser {
    
    private String pagina = "";
    private int aba = 1;

    public void exibirPagina (String pagina){
        this.pagina = pagina;
        System.out.println("Exibindo pagina: " + pagina + " na aba " + aba);
    }

    public void adicionarNovaAba(int aba){
        this.aba = aba;
        System.out.println(aba + " Abas adicionadas");
    }

    public void atualizarPagina(){
        System.out.println("Recarregando pagina...");
        exibirPagina(pagina);
    }

}
