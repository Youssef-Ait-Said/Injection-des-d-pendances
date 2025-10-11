package metier;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ImetierImpl implements IMetier {
    @Autowired
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
