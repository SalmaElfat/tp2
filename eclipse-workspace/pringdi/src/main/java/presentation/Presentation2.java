package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"dao", "metier"})

public class Presentation2 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev");  // Active le profil "dev"
        context.register(Presentation2.class);
        context.refresh();
        
        // Récupération du bean IMetier
        IMetier metier = context.getBean(IMetier.class);
        
        // Exécution et affichage du résultat
        System.out.println("Résultat = " + metier.calcul());
    }
}
