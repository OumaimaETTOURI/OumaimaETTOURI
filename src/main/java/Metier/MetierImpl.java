package Metier;

import dao.IDao;

public class MetierImpl implements IMetier{
    private IDao dao;
    @Override
    public double calcul()
    {
        double t=dao.getData();
        double res=t*30;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}