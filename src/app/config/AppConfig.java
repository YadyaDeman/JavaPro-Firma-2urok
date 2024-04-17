package app.config;

import app.staff.administration.Director;
import app.staff.administration.ProduvtionChief;
import app.staff.administration.SalesChief;
import app.staff.specialists.Secretary;
import app.staff.specialists.production.MachineOperator;
import app.staff.specialists.production.StoreKeeper;
import app.staff.specialists.sales.Merchandiser;
import app.staff.specialists.sales.SalesManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfig {

    @Bean
    public ProduvtionChief produvtionChief() {
        return new ProduvtionChief();
    }

    @Bean
    public SalesChief salesChief() {
        return new SalesChief();
    }

    @Bean
    public MachineOperator machineOperator() {
        return new MachineOperator();
    }

    @Bean
    public StoreKeeper storeKeeper() {
        return new StoreKeeper();
    }

    @Bean
    public Merchandiser merchandiser() {
        return new Merchandiser();
    }

    @Bean
    public SalesManager salesManager() {
        return new SalesManager();
    }

    @Bean
    public Director director() {
        return new Director();
    }

    @Bean
    public Secretary secretary() {
        return new Secretary();
    }

}
