package pres;

import dao.DaoImpl;
import dao.DaoImplV2;
import dao.IDao;
import metier.IMetier;
import metier.ImetierImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pres1 {

    public static void main(String[] args) throws Exception {

        ApplicationContext context_Annot = new AnnotationConfigApplicationContext("dao", "metier");
        IMetier metier = context_Annot.getBean(IMetier.class);

        System.out.println("Res = "+metier.calcul());
    }
}



