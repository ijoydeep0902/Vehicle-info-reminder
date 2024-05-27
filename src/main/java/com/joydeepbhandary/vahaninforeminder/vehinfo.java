package com.joydeepbhandary.vahaninforeminder;

public class vehinfo {

String vehno;
String insurance;

    String tax;
    String fitness;
    String pollution;

    public vehinfo(String vehno, String insurance, String tax, String fitness, String pollution) {
        this.vehno = vehno;
        this.insurance = insurance;
        this.tax = tax;
        this.fitness = fitness;
        this.pollution = pollution;
    }



    public String getVehno() {
        return vehno;
    }

    public String getInsurance() {
        return insurance;
    }

    public String getTax() {
        return tax;
    }

    public String getFitness() {
        return fitness;
    }

    public String getPollution() {
        return pollution;
    }
}
