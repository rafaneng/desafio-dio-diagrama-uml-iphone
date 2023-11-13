package dio.project.iphone.funcionalidade;

import dio.project.iphone.biblioteca.Musica;

public interface ReprodutorMusical {
    public void tocar(Musica musica);
    public void pausar();
    public void selecionarMusica(Musica musica);
}
