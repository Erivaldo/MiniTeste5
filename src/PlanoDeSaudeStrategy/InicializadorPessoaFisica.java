package PlanoDeSaudeStrategy;

import java.util.LinkedList;
import java.util.List;

public class InicializadorPessoaFisica implements InicializadorPlanoDeSaude {

	
	public PlanoDeSaude cadastro (String p) {
		PlanoDeSaudePF PF = new PlanoDeSaudePF();
		String [] planoPF = p.split("/");
		PF.setCPF(planoPF[0]);
		PF.setNome(planoPF[1]);
		return PF;
		
	
	} 
	
}
