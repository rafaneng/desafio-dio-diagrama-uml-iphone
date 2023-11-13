package dio.project.iphone.aparelho;

import dio.project.iphone.biblioteca.Contato;
import dio.project.iphone.biblioteca.Musica;
import dio.project.iphone.biblioteca.Pagina;
import dio.project.iphone.funcionalidade.AparelhoTelefonico;
import dio.project.iphone.funcionalidade.NavegadorInternet;
import dio.project.iphone.funcionalidade.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;

    public Iphone(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void ligar(Contato contato) {
        System.out.printf("Ligando para o contato %s %n", contato.getNome());
    }

    @Override
    public void atender() {
        System.out.printf("Atendendo iPhone: %s %n", modelo);
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.printf("Iniciando Correio de Voz iPhone: %s %n", modelo);
    }

    @Override
    public void exibirPagina(Pagina pagina) {
        System.out.printf("Exibindo página de internet: %s, no iPhone: %s %n", pagina.getEndereco(), modelo);
    }

    @Override
    public void adicionarNovaAba(Pagina pagina) {
        System.out.printf("Adicionando nova aba: %s, no iPhone: %s %n", pagina.getEndereco(), modelo);
    }

    @Override
    public void atualizarPagina() {
        System.out.printf("Atualizando página de internet no iPhone: %s %n", modelo);
    }

    @Override
    public void tocar(Musica musica) {
        System.out.printf("Tocando música: %s, no iPhone: %s %n", musica.getNome(), modelo);
    }

    @Override
    public void pausar() {
        System.out.printf("Pausando música no iPhone: %s %n", modelo);
    }

    @Override
    public void selecionarMusica(Musica musica) {
        System.out.printf("Selecionada música: %s, no iPhone: %s %n", musica.getNome(), modelo);
    }
}
