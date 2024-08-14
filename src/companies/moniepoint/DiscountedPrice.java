package companies.moniepoint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DiscountedPrice {
    public static int getDiscountedPrice(int barcode) {
        double price = 0.0;
        double discount = 0.0;
        try {
            String apiUrl = "https://jsonmock.hackerrank.com/api/inventory?barcode=" + barcode;
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();
            connection.disconnect();
            String responseBody = response.toString();
            Pattern pricePattern = Pattern.compile("\"price\":(\\d+(\\.\\d+)?)");
            Matcher priceMatcher = pricePattern.matcher(responseBody);
            if (priceMatcher.find()) {
                price = Double.parseDouble(priceMatcher.group(1));
            }
            Pattern discountPattern = Pattern.compile("\"discount\":(\\d+(\\.\\d+)?)");
            Matcher discountMatcher = discountPattern.matcher(responseBody);
            if (discountMatcher.find()) {
                discount = Double.parseDouble(discountMatcher.group(1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return (int) (price * (100 - discount) / 100);
    }

    public static void main(String[] args) {
        System.out.println(getDiscountedPrice(74005364));
    }
}
