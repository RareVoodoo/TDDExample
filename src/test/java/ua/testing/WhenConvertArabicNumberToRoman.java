package ua.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class WhenConvertArabicNumberToRoman
{
    @Test
    public void ConvertZeroToEmptyString(){
        String romanNumber = ConvertToRoman(0);
        assertEquals("", romanNumber);
    }

    private String ConvertToRoman(int i) {
        ArabicToRomanNumberConverter converter = new ArabicToRomanNumberConverter();
        return  converter.convert(i);
    }

    @Test
    public void ConvertOneToRoman(){
        String romanNumber = ConvertToRoman(1);
        assertEquals("I", romanNumber);
    }

    @Test
    public void ConvertTwoToRoman(){
        String romanNumber = ConvertToRoman(2);
        assertEquals("II", romanNumber);
    }

    @Test
    public void ConvertFiveToRoman(){
        String romanNumber = ConvertToRoman(5);
        assertEquals("V", romanNumber);
    }

    @Test
    public void ConvertSixToRoman(){
        String romanNumber = ConvertToRoman(6);
        assertEquals("VI", romanNumber);
    }


}
