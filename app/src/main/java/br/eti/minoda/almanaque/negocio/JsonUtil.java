package br.eti.minoda.almanaque.negocio;

import android.content.Context;
import android.util.JsonReader;
import android.util.JsonToken;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class JsonUtil {

    public List<Item> readAlmanaqueJsonStream(Context context) throws IOException {

        //open the inputStream to the file
        InputStream inputStream = context.getAssets().open("almanaque.json");

        JsonReader reader = new JsonReader(new InputStreamReader(inputStream, "UTF-8"));
        try {
            return readItensArray(reader);
        }
            finally {
                reader.close();
            }
    }

    private List<Item> readItensArray(JsonReader reader) throws IOException {
        List<Item> itens = new ArrayList<Item>();

        reader.beginArray();
        while (reader.hasNext()) {
            itens.add(readItem(reader));
        }
        reader.endArray();
        return itens;
    }

    private Item readItem(JsonReader reader) throws IOException {
        long id = -1;
        String text = null;
        User user = null;
        List geo = null;

        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("id")) {
                id = reader.nextLong();
            } else if (name.equals("nome")) {
                text = reader.nextString();
            } else if (name.equals("geo") && reader.peek() != JsonToken.NULL) {
                geo = readDoublesArray(reader);
            } else if (name.equals("user")) {
                user = readUser(reader);
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();


        return new Item("99999", TipoItem.PESSOA, text, text.substring(1,3));
    }

    private List readDoublesArray(JsonReader reader) throws IOException {
        List doubles = new ArrayList();

        reader.beginArray();
        while (reader.hasNext()) {
            doubles.add(reader.nextDouble());
        }
        reader.endArray();
        return doubles;
    }

    private User readUser(JsonReader reader) throws IOException {
        String username = null;
        int followersCount = -1;

        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                username = reader.nextString();
            } else if (name.equals("followers_count")) {
                followersCount = reader.nextInt();
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return new User(username, followersCount);
    }

    private class User {
        private String nome;
        private int seguidores;

        public User(String nome, int seguidores) {
            this.nome = nome;
            this.seguidores = seguidores;
        }

        public String getNome() {
            return nome;
        }

        public int getSeguidores() {
            return seguidores;
        }
    }
}
