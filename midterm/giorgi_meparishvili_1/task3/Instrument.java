package midterm.giorgi_meparishvili_1.task3;

public class Instrument {
    private String instrumentName;
    private String instrumentType;

    // Constructor
    public Instrument(String instrumentName, String instrumentType) {
        this.instrumentName = instrumentName;
        this.instrumentType = instrumentType;
    }

    // Getter and setter for instrumentName
    public String getInstrumentName() {
        return instrumentName;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    // Getter and setter for instrumentType
    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    // Overriding toString method to provide a brief description of the instrument
    @Override
    public String toString() {
        return "Instrument: " + instrumentName + " (Type: " + instrumentType + ")";
    }
}

