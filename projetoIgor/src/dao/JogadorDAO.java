package dao;



import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import persistence.Jogador;

public class JogadorDAO extends HibernateDaoSupport{

	public void passarPontos(Jogador jogador) {
			getHibernateTemplate().save(jogador);
	}
	@SuppressWarnings("unchecked")
	public List<Jogador> listarJogadores()
	{ 	
		return getHibernateTemplate().find("from Jogador order by pontos Desc");
		
	}

}
