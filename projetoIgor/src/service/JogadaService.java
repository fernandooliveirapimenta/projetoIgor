package service;

import java.util.List;

import persistence.Jogador;
import persistence.Vencedores;
import dao.JogadorDAO;
import dao.VencedoresDAO;

public class JogadaService {
	private JogadorDAO jogadorDao; 
	private VencedoresDAO vencedorDao;
	private JogadorService jogadorService;
	private ConfiguraService configService;

	public int jogada(int x, int y)
	{
		 if(configService.getJogo().Jogada(x, y))
		 {  
			 salvarJogador(jogadorService);
			 configService.setJogador(listarJogadores());
			 jogadorService.zerarPontos();
			 return 1; //perdeu
		 }
		 else
		 { 
			 jogadorService.setPontos(10);
			 if(configService.getJogo().isTerminar())
			 {   
				 salvarJogador(jogadorService);
				 salvarVencedor(jogadorService);
				 configService.setVencedores(listarVencedores());
				 jogadorService.zerarPontos();
				 return 2; //venceu
			 }
		 }
		return 3;//continue
	}
	public void salvarJogador(JogadorService jogadorService)
	{
		 Jogador jogador =new Jogador();
		 jogador.setNome(jogadorService.getNome());
		 jogador.setPontos(jogadorService.getPontos());
		 jogadorDao.passarPontos(jogador);
	}
	public void salvarVencedor(JogadorService jogadadorService)
	{
		Vencedores vencedor = new Vencedores();
		vencedor.setNome(jogadadorService.getNome());
		vencedorDao.criarVencedor(vencedor);
	}
	public List<Vencedores> listarVencedores()
	{
		return vencedorDao.listarVencedores();
	}
	public List<Jogador> listarJogadores()
	{
		return jogadorDao.listarJogadores();
	}
	public void setJogadorDao(JogadorDAO jogadorDao) {
		this.jogadorDao = jogadorDao;
	}
	public void setVencedorDao(VencedoresDAO vencedorDao) {
		this.vencedorDao = vencedorDao;
	}
	public void setJogadorService(JogadorService jogadorService) {
		this.jogadorService = jogadorService;
	}
	public void setConfigService(ConfiguraService configService) {
		this.configService = configService;
	}
}
