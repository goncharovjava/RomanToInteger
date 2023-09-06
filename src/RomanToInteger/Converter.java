package RomanToInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Converter {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a roman number to be converted to decimal: ");
        String romanString = bufferedReader.readLine();
        System.out.println("Conversion result equals " + romanToInteger(romanString));
    }
    public static int romanToInteger(String s) {
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("I", 1);
        mapa.put("V", 5);
        mapa.put("X", 10);
        mapa.put("L", 50);
        mapa.put("C", 100);
        mapa.put("D", 500);
        mapa.put("M", 1000);


        return 0;
    }
}
