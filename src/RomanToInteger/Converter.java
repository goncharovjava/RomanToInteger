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

        int result = 0;
        int temp = 0;

        for (int i = 0; i < s.length(); i++) {
            int temp1 = mapa.get(String.valueOf(s.charAt(i)));
            if (temp1 > temp){
                result = result + temp1 - (temp * 2);
            }else {
                result += temp1;
            }
            temp = temp1;
        }

        return result;
    }
}
