package be.digitalcity.formation.revisions;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Reservation {

    private int nRooms;
    private int nbPeoples;
    private String name;
    private String surname;
    private String fullName;
    private LocalDate arrivalDate;
    private LocalDate departureDate;
    private List<OptionsHotel> options;
    private double totalPriceHTVA;

    public Reservation(int nRooms, int nbPeoples, String name, String surname, String fullName, LocalDate arrivalDate, LocalDate departureDate, List<OptionsHotel> options, double totalPriceHTVA) {
        this.nRooms = nRooms;
        this.nbPeoples = nbPeoples;
        this.name = name;
        this.surname = surname;
        this.fullName = fullName;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.options = options;
        this.totalPriceHTVA = totalPriceHTVA;
    }

    public int getnRooms() {
        return nRooms;
    }

    public void setnRooms(int nRooms) {
        this.nRooms = nRooms;
    }

    public int getNbPeoples() {
        return nbPeoples;
    }

    public void setNbPeoples(int nbPeoples) {
        this.nbPeoples = nbPeoples;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public List<OptionsHotel> getOptions() {
        return options;
    }

    public void setOptions(List<OptionsHotel> options) {
        this.options = options;
    }

    public double getTotalPriceHTVA() {
        return totalPriceHTVA;
    }

    public void setTotalPriceHTVA(double totalPriceHTVA) {
        this.totalPriceHTVA = totalPriceHTVA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return nRooms == that.nRooms && nbPeoples == that.nbPeoples && Double.compare(that.totalPriceHTVA, totalPriceHTVA) == 0 && Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(fullName, that.fullName) && Objects.equals(arrivalDate, that.arrivalDate) && Objects.equals(departureDate, that.departureDate) && Objects.equals(options, that.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nRooms, nbPeoples, name, surname, fullName, arrivalDate, departureDate, options, totalPriceHTVA);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reservation{");
        sb.append("nRooms=").append(nRooms);
        sb.append(", nbPeoples=").append(nbPeoples);
        sb.append(", name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", fullName='").append(fullName).append('\'');
        sb.append(", arrivalDate=").append(arrivalDate);
        sb.append(", departureDate=").append(departureDate);
        sb.append(", options=").append(options);
        sb.append(", totalPriceHTVA=").append(totalPriceHTVA);
        sb.append('}');
        return sb.toString();
    }

    public int daysOfOccupation() {
        // Pas ok recheck plus tard
        return this.departureDate.getDayOfMonth() - this.arrivalDate.getDayOfMonth();
    }

    public double totalPriceTVAC() {
        double totalPrice = 0;

        return totalPrice;
    }

}
