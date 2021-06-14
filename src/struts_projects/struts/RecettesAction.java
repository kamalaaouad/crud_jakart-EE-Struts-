package struts_projects.struts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import struts_projects.model.Recette;
@Namespace("/recettes")
public class RecettesAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6340307477848832420L;
	private static Map<Integer,Recette> recettes = new HashMap<Integer,Recette>();
	private Recette recette;
	private int id_selectionner;

	public int getId_selectionner() {
		return id_selectionner;
	}


	public void setId_selectionner(int id_selectionner) {
		this.id_selectionner = id_selectionner;
	}

	//constrecteur statique au début de demarrage d'application
	/*
	 * static { recettes.add(new Recette(1,"rece1","List 1")); recettes.add(new
	 * Recette(2,"rece2","List 2")); recettes.add(new Recette(3,"rece3","List 3"));
	 * }
	 */
	//constrecteur d'instance est créer a chaque fois une action est créer
	public RecettesAction() {
		
	}
	
	
	@Action(value = "recettesListes" , results= {@Result(name = "liste-recette",location = "/WEB-INF/content/recettes/recettes.jsp")})
	private String lesRecettes() {
		return "liste-recette";
	}
	
	@Action(value = "ajouter-recette",results= {
			@Result(name = "recette-saved",location = "/WEB-INF/content/recettes/recettes.jsp"),
			@Result(name = "recette-error",location = "/WEB-INF/content/recettes/erreur.jsp")
	})
	public String ajouter_recette() {
		
		if(recette != null) {
			recettes.put(recette.getId(), recette);
			System.out.println(recette);
			return "recette-saved";
		}else {
			return "recette-error";
		}
	}
	
	@Action(value = "ajouter-form",results= {@Result(name = "ajout-form",location = "/WEB-INF/content/recettes/add-recette.jsp")})
	public String add() {
		return "ajout-form";
	}
	
	
	@Action(value="deleteRecette",
			results = {@Result(name = "recette-delete",
			location = "/WEB-INF/content/recettes/recettes.jsp")})
	public String delete() {
		System.out.println(id_selectionner+"kyn");
		for (Map.Entry<Integer, Recette> rc : recettes.entrySet()) {
			if(rc.getKey() == id_selectionner) {
				System.out.println(id_selectionner+"=="+rc.getKey());
				recettes.remove((rc.getKey()));
			}
		}
		return "recette-delete";
	}
	
	@Action(value = "editRecette",
			results = {@Result(name = "edit-recette",
			location = "/WEB-INF/content/recettes/edit.jsp"),
					@Result(name = "recette-error",
					location = "/WEB-INF/content/recettes/erreur.jsp")})
	public String edit() {
		for (Map.Entry<Integer, Recette> rc : recettes.entrySet()) {
			if(rc.getKey() == id_selectionner) {
				System.out.println(id_selectionner+"=="+rc.getKey());
				recette = rc.getValue();
				return "edit-recette";
			}
		}
		return "recette-error";
	}
	
	@Action(value = "update-recette",results= {
			@Result(name = "recette-update",location = "/WEB-INF/content/recettes/recettes.jsp"),
			@Result(name = "recette-error",location = "/WEB-INF/content/recettes/erreur.jsp")
	})
	public String update() {
		System.out.println(recette.getId());
		if(recette != null) {
			for (Map.Entry<Integer, Recette> rc : recettes.entrySet()) {
				if(rc.getKey() == recette.getId()) {
					System.out.println(recette.getId()+"=="+rc.getKey());
					recettes.put(recette.getId(), recette);
					return "recette-update";
				}
			}
			
		}else {
			return "recette-error";
		}
		return null;
	}
	
	
	
	public  Map<Integer,Recette> getRecettes() {
		return recettes;
	}

	public  void setRecettes(Map<Integer,Recette> recettes) {
		RecettesAction.recettes = recettes;
	}

	public Recette getRecette() {
		return recette;
	}

	public void setRecette(Recette recette) {
		this.recette = recette;
	}
	
}
