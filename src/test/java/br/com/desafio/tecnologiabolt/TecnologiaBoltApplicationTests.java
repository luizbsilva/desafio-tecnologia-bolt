package br.com.desafio.tecnologiabolt;

import br.com.desafio.tecnologiabolt.regras.RegrasSequenciaEstavel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class TecnologiaBoltApplicationTests {

	@Autowired
	private RegrasSequenciaEstavel rules;
	@Test
	void contextLoads() {
	}
	@org.junit.Test
	public void testChallengeRules() {
		assertEquals(new Long(1), rules.operacoesNecessarias("{{{}"));
		assertEquals(new Long(2), rules.operacoesNecessarias("}{"));
		assertEquals(new Long(0), rules.operacoesNecessarias("{{}}"));
	}

}
