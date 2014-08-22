package PlanoDeSaudeStrategy;

import java.util.ArrayList;
import java.util.List;

public class CadastroDePlanoDeSaude {
	
	private List<PlanoDeSaude> plano;
	
	public CadastroDePlanoDeSaude(){
		plano = new ArrayList <PlanoDeSaude>();
	}
	
	public void cadastrarPlano( String p,InicializadorPlanoDeSaude iniciar ){
		plano.add(iniciar.cadastro(p));
	}
	
	public void setPlano(List<PlanoDeSaude> plano) {
		this.plano = plano;
	}

	public List<PlanoDeSaude> getPlano(){
		return plano;
	}
	
}
