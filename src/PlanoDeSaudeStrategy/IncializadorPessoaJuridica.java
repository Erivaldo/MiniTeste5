package PlanoDeSaudeStrategy;

import java.util.LinkedList;
import java.util.List;

public class IncializadorPessoaJuridica implements InicializadorPlanoDeSaude{

	public PlanoDeSaude cadastro (String p) {
		PlanoDeSaudePJ PJ = new PlanoDeSaudePJ();
		String [] planoPJ = p.split("/");
		PJ.setCNPJ(planoPJ[0]);
		PJ.setNome(planoPJ[1]);
		return PJ;
	}

}
