package pres;

import Metier.MetierImpl;
import dao.DaoImpl;
import ext.DaoImpl2;

public class presentation {
    public static void main(String[] args) {

        /*/
        instanciation statique :
         */
        DaoImpl2 dao=new DaoImpl2();
        MetierImpl metier = new MetierImpl();
        // le new a eliminer
        metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}