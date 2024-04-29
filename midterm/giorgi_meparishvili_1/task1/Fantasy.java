package midterm.giorgi_meparishvili_1.task1;

import java.util.ArrayList;
import java.util.List;

public class Fantasy extends AbstractFantasy implements Dream {
    private String studentName = "Giorgi"; // Your name

    @Override
    public String getFluorescent1() {
        return "Fluorescent1";
    }

    @Override
    public String getSpeaker2() {
        return "Speaker2";
    }

    @Override
    public String methodCryptography3(String argControl5) {
        return "Cryptography3: " + argControl5;
    }

    @Override
    public List<String> methodBark4(String argLedger6) {
        List<String> result = new ArrayList<>();
        result.add("Bark4: " + argLedger6);
        return result;
    }

    @Override
    public String toString() {
        String result = "Student Name: " + studentName + "\n";
        result += "Fluorescent1: " + getFluorescent1() + "\n";
        result += "Speaker2: " + getSpeaker2() + "\n";
        return result;
    }
}