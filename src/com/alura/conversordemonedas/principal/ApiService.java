package com.alura.conversordemonedas.principal;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiService {

    private static final String API_KEY = "b9f726e6e2f8cffb53a894dd";

    public static double obtenerTasa(String base, String destino) {

        try {
            String direccion =
                    "https://v6.exchangerate-api.com/v6/" + API_KEY +
                            "/pair/" + base + "/" + destino;

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .GET()
                    .build();

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            JsonObject jsonObject =
                    JsonParser.parseString(json).getAsJsonObject();

            return jsonObject
                    .get("conversion_rate")
                    .getAsDouble();

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Error al obtener tasa de cambio");
        }
    }
}