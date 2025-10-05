package metier;
import dao.IDao;

public class ImetierImpl implements IMetier {

    private IDao dao;

    @Override
    public double calcul() {
        double res = dao.getData() * 2;
        return res;
    }

    public void setDao(IDao dao){
        this.dao = dao;
    }
}
