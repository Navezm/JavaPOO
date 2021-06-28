package be.digitalcity.formation.local;

public class Calculator {

    public void faireConversionGPS(double data){

        class CoordonneesGPS {
            public double longitude;
            public double latitude;
        }

        CoordonneesGPS coordonneesGPS = new CoordonneesGPS();
        coordonneesGPS.latitude = data;
        coordonneesGPS.longitude = data;

        // ...

    }

}
