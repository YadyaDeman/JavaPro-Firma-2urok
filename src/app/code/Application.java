package app.code;

import app.staff.administration.Director;
import app.staff.administration.ProduvtionChief;
import app.staff.administration.SalesChief;
import app.staff.specialists.Secretary;
import app.staff.specialists.production.MachineOperator;
import app.staff.specialists.production.StoreKeeper;
import app.staff.specialists.sales.Merchandiser;
import app.staff.specialists.sales.SalesManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Application {
    public static void main(String[] args) {

        /*MachineOperator machineOperator = new MachineOperator();
        StoreKeeper storeKeeper = new StoreKeeper();

        Merchandiser merchandiser = new Merchandiser();
        SalesManager salesManager = new SalesManager();

        Secretary secretary = new Secretary();

        ProduvtionChief produvtionChief = new ProduvtionChief();
        produvtionChief.setMachineOperator(machineOperator);
        produvtionChief.setStoreKeeper(storeKeeper);

        SalesChief salesChief = new SalesChief();
        salesChief.setMerchandiser(merchandiser);
        salesChief.setSalesManager(salesManager);

        Director director = new Director();
        director.setSecretary(secretary);
        director.setSalesChief(salesChief);
        director.setProduvtionChief(produvtionChief);

        director.manageCompany();*/

        AbstractApplicationContext context = new AnnotationConfigApplicationContext("app.config");
        Director director =context.getBean(Director.class);
        director.manageCompany();


    }
}
