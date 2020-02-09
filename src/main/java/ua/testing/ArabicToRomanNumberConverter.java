package ua.testing;



import java.util.Collections;

import java.util.Map;
import java.util.TreeMap;

public class ArabicToRomanNumberConverter {
    public String convert(int arabicNumber) {
        boolean noNumber = arabicNumber == 0;
        if (noNumber)
            return getDefaultRomanNumber();

        return getRoughRomanNumber(arabicNumber);

    }

    Map<Integer, String > romanNumbersMap;

    public ArabicToRomanNumberConverter() {
        romanNumbersMap = new TreeMap<>(Collections.<Integer>reverseOrder());
        romanNumbersMap.put(1,"I");
        romanNumbersMap.put(5,"V");
    }

    private String getRoughRomanNumber(int arabicNumber) {
        String romanNumber = "";

        for (Map.Entry<Integer, String> item: romanNumbersMap.entrySet()){
            while (arabicNumber >= item.getKey()) {
                romanNumber += item.getValue();
                arabicNumber -= item.getKey();
            }
        }
        return romanNumber;
    }

    private String getDefaultRomanNumber() {
        return "";
    }
}
