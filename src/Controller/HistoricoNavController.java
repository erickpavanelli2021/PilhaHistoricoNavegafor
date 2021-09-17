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
			System.err.println("Site n�o � valido");
		}
	}
	
	public void removeEndereco(Pilha p) throws Exception {
		if (!p.isEmpty()) {
			String removido = p.pop();
			System.out.println("Site: " + removido + " foi removido do hist�rico");
			
		} else {
			System.err.println("N�o h� sites no hist�rico");
		}
	}
	
	public void consultaUltimo(Pilha p) throws Exception {
		if (!p.isEmpty()){
			String top = p.top();
			System.out.println("�ltimo site visitado: " + top);
		} else {
			System.err.println("N�o h� sites no hist�rico");
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