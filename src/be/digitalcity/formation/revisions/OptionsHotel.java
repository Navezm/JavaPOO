package be.digitalcity.formation.revisions;

import java.io.Serializable;
import java.util.Objects;

public class OptionsHotel implements Serializable {

    private String service;
    private double price;
//    private Occurence occurence;
    private String occurence;
    private boolean person;

    public OptionsHotel(String[] splitTable) {
        this.service = splitTable[0];
        this.price = Double.parseDouble(splitTable[1]);
//        switch (splitTable[2]) {

//            case Occurence.JOURNALIER.name():
//
//                break;
//            case Occurence.SEMAINE.name():
//
//                break;
//            case Occurence.SPORADIQUE.name():
//
//                break;
//        }
        this.occurence = splitTable[2];
        this.person = !splitTable[3].equals("0");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OptionsHotel that = (OptionsHotel) o;
        return Double.compare(that.price, price) == 0 && person == that.person && Objects.equals(service, that.service) && occurence == that.occurence;
    }

    @Override
    public int hashCode() {
        return Objects.hash(service, price, occurence, person);
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
