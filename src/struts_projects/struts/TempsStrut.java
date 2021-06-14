package struts_projects.struts;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import struts_projects.model.Recette;

@Namespaces(value = { @Namespace(value = "/clients") })
public class TempsStrut extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long tms;

	private Recette recette;

	public Recette getRecette() {
		return recette;
	}

	public void setRecette(Recette recette) {
		this.recette = recette;
	}

	public long getTms() {
		return this.tms;
	}

	public String execute() {
		tms = System.currentTimeMillis();
		if (tms % 2 == 0)
			return "pair";
		else
			return "impair";
	}

	@Action(value = "AjouterClient", results = @Result(name = "client-ajoute", location = "/WEB-INF/content/clients/client.jsp"))
	public String Ajouter() {

		return "client-ajoute";
	}
	
	@Action(value = "ajouter-recette")
	public void Ajouter_Recette() {
		
	}

}
