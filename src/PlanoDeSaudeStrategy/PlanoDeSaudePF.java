package PlanoDeSaudeStrategy;

public class PlanoDeSaudePF extends PlanoDeSaude {
	private String CPF;
	
	
	public void setCPF(String cpf) {
		CPF = cpf;
	}

	@Override
	public String getCadastro() {
		return this.CPF;
	}
	
	
}
