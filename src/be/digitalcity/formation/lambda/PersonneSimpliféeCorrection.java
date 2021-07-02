package be.digitalcity.formation.lambda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Objects;

public class PersonneSimpliféeCorrection {

    private String nomComplet;
    private long totalSecondes;

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public long getTotalSecondes() {
        return totalSecondes;
    }

    public void setTotalSecondes(long totalSecondes) {
        this.totalSecondes = totalSecondes;
    }

    public PersonneSimpliféeCorrection(String nomComplet, LocalDate dateEngagement) {
        this.nomComplet = nomComplet;
        this.totalSecondes = convertDateEngagement(dateEngagement);
    }

    private long convertDateEngagement(LocalDate dateEngagement) {
        return LocalDateTime.now().toInstant(ZoneOffset.UTC).toEpochMilli() - dateEngagement
                .atTime(0,0,0)
                .toInstant(ZoneOffset.UTC)
                .toEpochMilli();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonneSimpliféeCorrection that = (PersonneSimpliféeCorrection) o;
        return totalSecondes == that.totalSecondes && Objects.equals(nomComplet, that.nomComplet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomComplet, totalSecondes);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonneSimpliféeCorrection{");
        sb.append("nomComplet='").append(nomComplet).append('\'');
        sb.append(", totalSecondes=").append(totalSecondes);
        sb.append('}');
        return sb.toString();
    }
}
