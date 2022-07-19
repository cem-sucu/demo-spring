package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		
		//lire le fichier de configuration Spring
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		
		// récupérer la bean depuis le conteneur
		Prof prof1 = ctx.getBean("prof", Prof.class);
		
		//appeler des méthode sur notre bean 
		prof1.direCours();
		
		//fermer le contexte
		ctx.close();
	}

}
