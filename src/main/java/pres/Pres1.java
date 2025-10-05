package pres;

import dao.DaoImpl;
import dao.DaoImplV2;
import dao.IDao;
import metier.IMetier;
import metier.ImetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        IDao dao = new DaoImplV2();
        IMetier metier = new ImetierImpl(dao);

        System.out.println("Resultat :" + metier.calcul());
    }
}
