package com.example.tennisscoreboard;

public enum Nationality {

    AFG("Afghanistan"),
    ALB("Albania"),
    ARG("Argentina"),
    AUS("Australia"),
    AUT("Austria"),
    BEL("Belgium"),
    BLR("Belarus"),
    CAN("Canada"),
    CRO("Croatia"),
    CZE("Czech Republic"),
    ESP("Spain"),
    FRA("France"),
    GBR("Great Britain"),
    GER("Germany"),
    JPN("Japan"),
    NED("Netherlands"),
    ROU("Romania"),
    SRB("Serbia"),
    SUI("Switzerland"),
    UKR("Ukraine"),
    USA("United States"),
    UZB("Uzbekistan");

    private String name;

    Nationality(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
