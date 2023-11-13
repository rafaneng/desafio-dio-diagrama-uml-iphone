package dio.project.iphone.aparelho;

import dio.project.iphone.biblioteca.Musica;
import dio.project.iphone.funcionalidade.ReprodutorMusical;

public class Ipod implements ReprodutorMusical {
    private String modelo;

    public Ipod(String modelo) {
        this.modelo = modelo;
    }
    @Override
    public void tocar(Musica musica) {
        System.out.printf("Tocando música: %s, no iPod: %s %n", musica.getNome(), modelo);
    }

    @Override
    public void pausar() {
        System.out.printf("Pausando música no iPod: %s %n", modelo);
    }

    @Override
    public void selecionarMusica(Musica musica) {
        System.out.printf("Selecionada música: %s, no iPod: %s %n", musica.getNome(), modelo);
    }
}
