package dao;


import org.springframework.stereotype.Component;

@Component
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("Version Base de donnees");
        double t = 24 * (Math.pow(5,2));
        return t;
    }
}
