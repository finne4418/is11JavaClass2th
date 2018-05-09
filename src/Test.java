import java.io.*;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        long[] deposits = {110000, 120000, 130000, 140000, 150000, 160000, 170000, 180000, 190000, 200000};
        double[] rates = {10, 10, 10, 10, 10, 10.0, 10, 10, 10, 10};

        //計算、計算結果をファイルに書き込む処理
        for (int i = 0; i < deposits.length; i++ ) {
            calcInterest(deposits[i], rates[i]);
        }

        //ファイルから記録した日割利息金の合計を計算する
        double interest = readSum();
        System.out.println(interest);
    }

    private static void calcInterest(long deposit, double rate) {
        double interest = deposit * (rate / 100);
        write(interest);
    }

    private static void write(double interest) {
        File file = new File("interest.csv");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write(interest + ",");
            bw.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static double readSum() {
        String text = read();
        String[] texts = text.split(",");
        double[] interests = Arrays.stream(texts).mapToDouble(Double::parseDouble).toArray();

        double sum = 0;
        for (double d : interests) {
            sum += d;
        }
        return sum;
    }

    private static String read() {
        File file = new File("interest.csv");
        String text = "";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            text =  br.readLine();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}
