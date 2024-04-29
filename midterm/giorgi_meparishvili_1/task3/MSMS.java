package midterm.giorgi_meparishvili_1.task3;

import java.util.ArrayList;
import java.util.List;

public class MSMS {
    private List<Instrument> instrumentStorage = new ArrayList<>();

    public void addInstrument(Instrument instrument) {
        instrumentStorage.add(instrument);
    }

    public boolean removeInstrument(Instrument instrument) {
        return instrumentStorage.remove(instrument);
    }

    public void printInstrumentStorage() {
        if (instrumentStorage.isEmpty()) {
            System.out.println("The instrument storage is empty.");
        } else {
            for (Instrument instrument : instrumentStorage) {
                System.out.println(instrument);
            }
        }
    }
}
