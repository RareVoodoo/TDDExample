package ua.testing;

public class ArabicToRomanNumberConverter {
    public String convert(int arabicNumber) {
        boolean noNumber = arabicNumber == 0;
        if (noNumber)
            return getDefaultRomanNumber();

        return getRomanNumber(arabicNumber);

    }

    private String getRomanNumber(int arabicNumber) {
        String romanNumber = "";
        while (arabicNumber >= 5) {
            romanNumber += "V";
            arabicNumber -= 5;
        }

        while (arabicNumber >= 1) {
            romanNumber += "I";
            arabicNumber--;
        }
        return romanNumber;
    }

    private String getDefaultRomanNumber() {
        return "";
    }
}
