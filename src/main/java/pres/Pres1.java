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
 // methode par fichier config.xml:
        ApplicationContext contex = new ClassPathXmlApplicationContext("config.xml");

        IMetier metier =  (IMetier) contex.getBean("met"); // getBean() => prend comme parammetre  le id du bean qu on veurt creer.
//        IDao dao = new DaoImpl();
//        ImetierImpl metier = new ImetierImpl();
//        metier.setDao(dao);add 

        System.out.println("Resultat :" + metier.calcul());



    }
}



