package model;

import persistence.Configuracao;
public class Jogo {
	private Tabuleiro tab;
	private Layout layout;
    boolean terminar = false;
    boolean ganhou = false;
    
    public Jogo(Configuracao config){
        tab = new Tabuleiro(config);
        layout = new Layout(tab, config);
        layout.exibe();    
    }
    public boolean Jogada(int x, int y) {
    	layout.exibe(); 
        if(!terminar){
            tab.abrirVizinhas(x,y);
            terminar = tab.isVencedor();
            tab.iniciaTabuleiroJogo();
        }
        layout.exibeMinas();
        return tab.isDerrota(x+1, y+1);
	}
		public Tabuleiro getTab() {
			return tab;
		}

		public boolean isTerminar() {
			return terminar;
		}
}
