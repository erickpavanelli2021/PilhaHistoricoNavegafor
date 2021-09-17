package Controller;

import br.edu.fateczl.erick.pilhastring.Pilha;

public class HistoricoNavController {

	public HistoricoNavController() {
		super();
	}
	
	public void insereEndereco(Pilha p, String site){
		boolean valido = validaSite(site);
		if (valido){
			p.push(site);
		} else {
			System.err.println("Site não é valido");
		}
	}
	
	public void removeEndereco(Pilha p) throws Exception {
		if (!p.isEmpty()) {
			String removido = p.pop();
			System.out.println("Site: " + removido + " foi removido do histórico");
			
		} else {
			System.err.println("Não há sites no histórico");
		}
	}
	
	public void consultaUltimo(Pilha p) throws Exception {
		if (!p.isEmpty()){
			String top = p.top();
			System.out.println("Último site visitado: " + top);
		} else {
			System.err.println("Não há sites no histórico");
		}
	}

	private boolean validaSite(String site) {
		String[] vetSite = site.split("\\.");
		if (vetSite[0].equals("http://www") &&
				vetSite.length > 2) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
	
}