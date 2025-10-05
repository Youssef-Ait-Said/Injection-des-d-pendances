package dao;

public class DaoImplV2 implements IDao{
    @Override
    public double getData() {
        System.out.println("Version de Web Service");
        double Tt = 114*2.5;
        return Tt;
    }
}
