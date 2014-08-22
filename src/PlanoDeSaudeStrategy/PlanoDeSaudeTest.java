package PlanoDeSaudeStrategy;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class PlanoDeSaudeTest {
	private CadastroDePlanoDeSaude cadastro;
	
	
	@Before
	public void criar(){
		cadastro = new CadastroDePlanoDeSaude();
	}

	@Test
	public void cadastrarPessoaFisica() {
		String plano1= "Erivaldo/0000000";
		cadastro.cadastrarPlano(plano1, new InicializadorPessoaFisica());
		Assert.assertEquals(1, cadastro.getPlano().size());
		
	}
	@Test
	public void cadastrarPessoaJuridica() {
		String plano2= "Spartacus/00055500";
		cadastro.cadastrarPlano(plano2, new IncializadorPessoaJuridica());
		Assert.assertEquals(1, cadastro.getPlano().size());
	}
	
}
