package com.company;

public enum CarBrand {
    MERCEDES ("GLB250, GERMAN, 2020"),
    BMW ("I8, GERMAN, 2019"),
    MAZDA ("MX-5 Miata ST, JAPAN, 2020"),
    TESLA ("MODEL X, USA, 2021"),
    TOYOTA ("SIENNA, JAPAN, 2021"),
    KIA ("RIO, SOUTH KOREA, 2021"),
    TMERCEDES("ACTORS, GERMAN, 2020"),
    MACK("ANTHEM, USA,2021"),
    VOLVO("VNR, SWEDEN , 2021")
    ;

    private final String infoBrand;

    CarBrand(String info) {
        this.infoBrand = info;
    }

    public String getInfoBrand() {
        return this.infoBrand;
    }
}
