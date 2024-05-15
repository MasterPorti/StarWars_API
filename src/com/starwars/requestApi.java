package com.starwars;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class requestApi {

    public static Film Film(int opcion) throws IOException, InterruptedException {
        Gson gson = new Gson();
        String url = "https://swapi.dev/api/films/" + opcion + "/";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        FilmSwapi film = gson.fromJson(json, FilmSwapi.class);
        System.out.println(film.title());
        return new Film(film);
    }
}
