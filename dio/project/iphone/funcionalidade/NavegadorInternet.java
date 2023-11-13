package dio.project.iphone.funcionalidade;

import dio.project.iphone.biblioteca.Pagina;

public interface NavegadorInternet {
    public void exibirPagina(Pagina pagina);
    public void adicionarNovaAba(Pagina pagina);
    public void atualizarPagina();
}
