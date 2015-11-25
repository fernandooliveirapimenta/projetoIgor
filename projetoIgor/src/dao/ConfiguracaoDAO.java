package dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import persistence.Configuracao;

public class ConfiguracaoDAO extends HibernateDaoSupport {

	public Configuracao createConfiguracao(Configuracao config) {
		getHibernateTemplate().save(config);
		return config;
	}
}
