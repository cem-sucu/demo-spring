package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Prof implements ProfService {
	
	private String nom;
	
	@Autowired
	@Qualifier ("coursOptionnel")
	private CoursService cours;
	
	public Prof() {
		System.out.println("Dans le constructeur vide");
	};
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

//	public Prof( String nomDuProf) {
//		this.nom = nomDuProf;
//		System.out.println("[Test] Dans le constructeur avec argument");
//	};


	public CoursService getCours() {
		return cours;
	}

	public void setCours(CoursService cours) {
		this.cours = cours;
	}

	@Override
	public void direCours() {
		// TODO Auto-generated method stub
		System.out.println("Prof de " + cours.nommerCours());
	}

}
