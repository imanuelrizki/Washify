package projek.washify.pembayaran;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetData {
    public static void main(String[] args) {
        String urlString = "https://mocki.io/v1/71a47d4c-0af2-4224-a5b6-23418b9896f1";

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // Lakukan sesuatu dengan data yang diterima
                System.out.println(response.toString());
            } else {
                System.out.println("Terjadi kesalahan dalam mengambil data.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}