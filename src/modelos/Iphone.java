package modelos;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void ligar(String numero) {
        System.out.printf("Ligando para o número %s", numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada telefônica");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.printf("Exibindo a página %s no navegador web", url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba no navegador web.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página atual no navegador web");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a música atual");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a execução da música atual");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.printf("Selecionando a música %s", musica);
    }
}
