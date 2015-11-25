package dao;

import java.util.List;



import org.springframework.orm.hibernate3.support.HibernateDaoSupport;



import persistence.Vencedores;

public class VencedoresDAO extends HibernateDaoSupport {

	public void criarVencedor(Vencedores vencedores) 
	{
			getHibernateTemplate().save(vencedores);
	}
	
	@SuppressWarnings("unchecked")
	public List<Vencedores> listarVencedores()
	{	
		return getHibernateTemplate().find("from Vencedores order by nome");
		
	}

}
