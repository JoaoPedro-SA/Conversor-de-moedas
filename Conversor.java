import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {
        public static Moeda buscaMoeda(String moedaBase) {
            URI conversor = URI.create("https://v6.exchangerate-api.com/v6/faa274f4e80f30d8b025fc85/latest/"+ moedaBase);

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(conversor)
                    .build();

            try {
                HttpResponse<String> response = HttpClient
                        .newHttpClient()
                        .send(request, HttpResponse.BodyHandlers.ofString());

                return new Gson().fromJson(response.body(), Moeda.class);

            } catch (Exception e) {
                throw new RuntimeException("Não consegui obter o valor da moeda");
            }
        }
}
