package service;

import java.util.List;

import model.Jogo;
import persistence.Configuracao;
import persistence.Jogador;
import persistence.Vencedores;
import dao.ConfiguracaoDAO;
import forms.ConfiguraForm;
public class ConfiguraService {
	private Jogo jogo;
	private ConfiguracaoDAO configDao;
	private JogadorService jogadorService;
	private char[][] tabuleiro;
	private List<Vencedores> vencedores;
	private List<Jogador> jogador;
	public void configurar(ConfiguraForm configform){
	 Configuracao config = new Configuracao();
	 config.setLinha(configform.getLinha()+1);
	 config.setColuna(configform.getColuna()+1);
	 config.setBomba(configform.getBomba());
	 jogadorService.setNome(configform.getNome());
	 jogo = new Jogo(configDao.createConfiguracao(config)); 
	 tabuleiro= jogo.getTab().getTabuleiroJogo();
}
	public Jogo getJogo() {
		return jogo;
	}
	public void setConfigDao(ConfiguracaoDAO configDao) {
		this.configDao = configDao;
	}
	public void setJogadorService(JogadorService jogadorService) {
		this.jogadorService = jogadorService;
	}
	public char[][] getTabuleiro() {
		return tabuleiro;
	}
	public List<Vencedores> getVencedores() {
		return vencedores;
	}
	public void setVencedores(List<Vencedores> vencedores) {
		this.vencedores = vencedores;
	}
	public List<Jogador> getJogador() {
		return jogador;
	}
	public void setJogador(List<Jogador> jogador) {
		this.jogador = jogador;
	}
}
