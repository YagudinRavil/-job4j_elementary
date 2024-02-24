package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;

    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(180);
        System.out.println("140 rubles are " + euro + " euro.");
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("180 rubles are " + dollar + " dollar.");
        float input2 = 180;
        float expected2 = 3;
        float output2 = Converter.rubleToDollar(input2);
        boolean passed2 = expected2 == output2;
        System.out.println("180 rubles are 3. Test result : " + passed2);
    }
}
