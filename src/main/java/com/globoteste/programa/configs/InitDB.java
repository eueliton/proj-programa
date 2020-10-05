package com.globoteste.programa.configs;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component 
public class InitDB {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@PostConstruct
	private void initDb() {
		String sqlStatements[] = { "DROP TABLE programa IF EXISTS",
				"CREATE TABLE programa(id  varchar(10) DEFAULT NULL,nome varchar(100) DEFAULT NULL,data_cadastro TIMESTAMP AS CURRENT_TIMESTAMP,ativo bit DEFAULT 1, data_exclusao TIMESTAMP DEFAULT NULL)",
				"INSERT INTO programa(id, nome) values('MAVO','MAIS VOCE')",
				"INSERT INTO programa(id, nome) values('N19H','NOVELA 1')",
				"INSERT INTO programa(id, nome) values('HUCK','CALDEIRAO DO HUCK')",
				"INSERT INTO programa(id, nome) values('DFAU','DOMINGAO DO FAUSTAO')",
				"CREATE UNIQUE INDEX IDXNAME ON programa(id)"

		};

		Arrays.asList(sqlStatements).forEach(sql -> {
			jdbcTemplate.execute(sql);
		});

	}

}
