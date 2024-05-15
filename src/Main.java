import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.starwars.Film;
import com.starwars.Opciones;
import com.starwars.SelectOpcion;
import com.starwars.requestApi;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        List<Film> films = new ArrayList<Film>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        while (true){
            int opcion = SelectOpcion.selectOpcion(sc);
            if (opcion == 4) {
                break;
            }
            System.out.println("Opción seleccionada: " + opcion);
            switch (opcion) {
                case 1:
                    int filmOpcion = Opciones.filmOpcion(sc);
                    Film film = requestApi.Film(filmOpcion);
                    films.add(film);
                    break;
                case 2:
                    System.out.println("Ver Personajes");
                    break;
                case 3:
                    System.out.println("Ver Planetas");
                    break;
            }
        }

        FileWriter file = new FileWriter("movies.json");
        file.write(gson.toJson(films));
        file.close();
        System.out.println(films);
    }
}