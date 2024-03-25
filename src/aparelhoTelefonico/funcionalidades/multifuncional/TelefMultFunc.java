package aparelhoTelefonico.funcionalidades.multifuncional;

import aparelhoTelefonico.funcionalidades.musica.ReprodutorMusica;
import aparelhoTelefonico.funcionalidades.navegador.NavegadorInternet;
import aparelhoTelefonico.funcionalidades.telefone.Telefone;

public class TelefMultFunc implements ReprodutorMusica, Telefone, NavegadorInternet  {
  public void tocarMusica() {
    System.out.println("Tocando Musica...");
  }
  public void pausarMusica() {
    System.out.println("Pausando Musica...");
  }
  public void selecionarMusica() {
    System.out.println("Selecionando Musica...");
  }

  public void ligar() {
    System.out.println("Fazendo ligaçao...");
  }
  public void atenter() {
    System.out.println("Atendendo ligaçao...");
  }
  public void correioVoz() {
    System.out.println("Gravando correio de voz...");
  }

  public void exibirPagina() {
    System.out.println("Exibindo página...");
  }
  public void adiciinarNovaPagina() {
    System.out.println("Adicionando nova pagina...");
  }
  public void atualizarPagina() {
    System.out.println("Atualizando página...");
  } 

}
