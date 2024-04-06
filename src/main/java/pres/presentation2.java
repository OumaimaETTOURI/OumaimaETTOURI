package pres;

import Metier.IMetier;
import dao.IDao;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class  presentation2 {

    public static void main(String[] args) throws Exception {
        /*
        instanciation dynamique

         */
        Scanner scan =new Scanner(new File("config.txt"));
        String daoClassName=scan.nextLine();
        Class cDao=Class.forName(daoClassName);//si classe existe : chargement de bytecode en memoire , sinon generation d'une exception
        //instancier la classe
        IDao dao = (IDao) cDao.newInstance();// fais appel au constructeur par defaut et depassse

        String MetierClassName=scan.nextLine();
        Class cMetier=Class.forName(MetierClassName);
        IMetier metier = (IMetier) cMetier.newInstance();



        Method method = cMetier.getMethod("setDao",IDao.class);
        method.invoke(metier,dao);
        System.out.println("Resultat => "+metier.calcul());


    }
}