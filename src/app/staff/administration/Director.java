package app.staff.administration;

import app.staff.specialists.Secretary;
import org.springframework.beans.factory.annotation.Autowired;

public class Director {
    @Autowired
    private Secretary secretary;
    @Autowired
    private ProduvtionChief produvtionChief;
    @Autowired
    private SalesChief salesChief;


    public Secretary getSecretary() {
        return secretary;
    }

    public ProduvtionChief getProduvtionChief() {
        return produvtionChief;
    }

    public SalesChief getSalesChief() {
        return salesChief;
    }

    public void setSecretary(Secretary secretary) {
        this.secretary = secretary;
    }

    public void setProduvtionChief(ProduvtionChief produvtionChief) {
        this.produvtionChief = produvtionChief;
    }

    public void setSalesChief(SalesChief salesChief) {
        this.salesChief = salesChief;
    }

    public void manageCompany() {
        secretary.work();
        produvtionChief.giveOrders();
        salesChief.giveOrders();

    }
}
