package dio.project.iphone;

import dio.project.iphone.aparelho.Iphone;
import dio.project.iphone.aparelho.Ipod;
import dio.project.iphone.biblioteca.Contato;
import dio.project.iphone.biblioteca.Musica;
import dio.project.iphone.biblioteca.Pagina;

public class Usuario {
    public static void main(String[] args) {
        Iphone iphone6S = new Iphone("6S");
        Ipod ipod3 = new Ipod("3");

        Contato contatoClaudio = new Contato("Cláudio");
        Musica musicaIfYouWanna = new Musica("If You Wanna");
        Pagina paginaGoogle = new Pagina("google.com.br");
        Pagina abaDio = new Pagina("dio.me");

        iphone6S.tocar(musicaIfYouWanna);
        iphone6S.pausar();
        iphone6S.selecionarMusica(musicaIfYouWanna);

        iphone6S.ligar(contatoClaudio);
        iphone6S.atender();
        iphone6S.iniciarCorreioVoz();

        iphone6S.exibirPagina(paginaGoogle);
        iphone6S.adicionarNovaAba(abaDio);
        iphone6S.atualizarPagina();

        ipod3.tocar(musicaIfYouWanna);
        ipod3.selecionarMusica(musicaIfYouWanna);
        ipod3.pausar();
    }
}