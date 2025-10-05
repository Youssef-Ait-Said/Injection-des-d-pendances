package metier;
import dao.IDao;

public class ImetierImpl implements IMetier {

    private IDao dao;

    public ImetierImpl(IDao dao){
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double res = dao.getData() * 2;
        return res;
    }
}
