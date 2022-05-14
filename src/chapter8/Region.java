package chapter8;

public enum Region {
    NE("Ajegunle", "Ikeja", "Abuja"),
    SE("Irepo", "Somolu"),
    NC("Mushin", "VI", "BI"),
    SS("Ring road", "Challenge"),
    NW("Bariga", "Mowe", "Molete"),
    SW("Ibadan", "Ijebu", "Ekiti");

    private String [] states;

    Region(String...states){
        this.states = states;
    }
}
