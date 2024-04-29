package midterm.giorgi_meparishvili_1.task3;

public class MusicSchoolTester {
    public static void main(String[] args) {
        // Create some students
        Student student1 = new Student("John", "Doe", "123456789");
        Student student2 = new Student("Jane", "Smith", "987654321");

        // Create some instruments
        Instrument instrument1 = new Instrument("Piano", "Keyboard");
        Instrument instrument2 = new Instrument("Guitar", "String");

        // Create an instance of MSMS
        MSMS msms = new MSMS();

        // Add instruments to the MSMS
        msms.addInstrument(instrument1);
        msms.addInstrument(instrument2);

        // Print the instrument storage
        msms.printInstrumentStorage();
    }
}
