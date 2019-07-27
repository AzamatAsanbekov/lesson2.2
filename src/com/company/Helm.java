package com.company;

public class Helm {
    private String helm;
    private String companyName;

    public Helm(String helm, String companyName) {
        this.helm = helm;
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Helm(String helm) {
        this.helm = helm;
    }

    public String getHelm() {
        return helm;
    }

    public void setHelm(String helm) {
        this.helm = helm;
    }
}

