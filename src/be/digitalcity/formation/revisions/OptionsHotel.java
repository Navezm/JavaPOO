package be.digitalcity.formation.revisions;

import java.io.Serializable;

public class OptionsHotel implements Serializable {

    private String service;
    private int price;
    private String occurence;
    private boolean person;

    public enum Occurence {
        JOURNALIER,
        SEMAINE,
        SPORADIQUE
    }

    public OptionsHotel(String service, int price, String occurence, boolean person) {
        this.service = service;
        this.price = price;
        this.occurence = occurence;
        this.person = person;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OptionsHotel{");
        sb.append("service='").append(service).append('\'');
        sb.append(", price=").append(price);
        sb.append(", occurence='").append(occurence).append('\'');
        sb.append(", person=").append(person);
        sb.append('}');
        return sb.toString();
    }
}
