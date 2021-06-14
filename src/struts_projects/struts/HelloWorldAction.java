package struts_projects.struts;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
	private static final long serialVersionUID = -286947675263153522L;
	private String nom;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String execute() {
		return "success";
	}
}
