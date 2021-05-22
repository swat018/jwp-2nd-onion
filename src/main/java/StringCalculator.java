public class StringCalculator {
    int add(String text) {
        if((text == null)||(text.isEmpty()))
        {
            return 0;
        }

        String[] values  = text.split(",");
        int sum = 0;
        for (String value : values){
            sum += Integer.parseInt(value);
        }
        return sum;
    }
}
