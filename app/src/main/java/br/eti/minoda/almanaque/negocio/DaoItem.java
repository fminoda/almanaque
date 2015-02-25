package br.eti.minoda.almanaque.negocio;

import android.content.Context;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Helper class para representação de um item manipulado pelo Almanaque.
 */
public class DaoItem {

    /**
     * An array of items.
     */
//    public static List<Item> ITEMS = new ArrayList<Item>();
    private List<Item> ITEMS = new ArrayList<Item>();

    /**
     * A map of items, by ID.
     */
//    public static Map<String, Item> ITEM_MAP = new HashMap<String, Item>();
    private Map<String, Item> ITEM_MAP = new HashMap<String, Item>();

//    static {
//        // Add 4 sample items.
//        addItem(new Item("1", TipoItem.PESSOA, "KSr. Joao", "Ta"));
//        addItem(new Item("2", TipoItem.PESSOA, "KDona Maria", "Tb"));
//        addItem(new Item("3", TipoItem.PESSOA, "KTia Gertrudes", "Tc"));
//        addItem(new Item("4", TipoItem.PESSOA, "KDona Marocas", "Td"));
//        addItem(new Item("5", TipoItem.PESSOA, "KSr. Joao 2", "Te"));
//        addItem(new Item("6", TipoItem.PESSOA, "KDona Maria 2", "Tf"));
//        addItem(new Item("7", TipoItem.PESSOA, "KTia Gertrudes 2", "Tg"));
//        addItem(new Item("8", TipoItem.PESSOA, "KDona Marocas 2", "Th"));
//        addItem(new Item("9", TipoItem.PESSOA, "KSr. Joao 3", "Ti"));
//        addItem(new Item("10", TipoItem.PESSOA, "KDona Maria 3", "Tj"));
//        addItem(new Item("11", TipoItem.PESSOA, "KTia Gertrudes 3", "Tk"));
//        addItem(new Item("12", TipoItem.PESSOA, "KDona Marocas 3", "Tl"));
//    }

    private Context context;

    public DaoItem(Context context) {
        // Add 4 sample items.
        //addItem(new Item("1", TipoItem.PESSOA, "KSr. Joao", "Ta"));
        //addItem(new Item("2", TipoItem.PESSOA, "KDona Maria", "Tb"));
        //addItem(new Item("3", TipoItem.PESSOA, "KTia Gertrudes", "Tc"));
        //addItem(new Item("4", TipoItem.PESSOA, "KDona Marocas", "Td"));
        //addItem(new Item("5", TipoItem.PESSOA, "KSr. Joao 2", "Te"));
        //addItem(new Item("6", TipoItem.PESSOA, "KDona Maria 2", "Tf"));
        //addItem(new Item("7", TipoItem.PESSOA, "KTia Gertrudes 2", "Tg"));
        //addItem(new Item("8", TipoItem.PESSOA, "KDona Marocas 2", "Th"));
        //addItem(new Item("9", TipoItem.PESSOA, "KSr. Joao 3", "Ti"));
        //addItem(new Item("10", TipoItem.PESSOA, "KDona Maria 3", "Tj"));
        //addItem(new Item("11", TipoItem.PESSOA, "KTia Gertrudes 3", "Tk"));
        //addItem(new Item("12", TipoItem.PESSOA, "KDona Marocas 3", "Tl"));
        this.context = context;
        recuperaItens();
    }


 //   private static void addItem(Item item) {
 //
 //       ITEMS.add(item);
 //       ITEM_MAP.put(item.getId(), item);
 //   }

    private void addItem(Item item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.getId(), item);
    }

    public List<Item> getItens() {
        return ITEMS;
    }

    public Map<String, Item> getItemMap() {
        return ITEM_MAP;
    }

    private void recuperaItens() {
        JsonUtil jsonUtil = new JsonUtil();

        try {
            List<Item> listTeste = jsonUtil.readAlmanaqueJsonStream(context);
            for (Item item : listTeste) {
                //list.add(item.getDescricao());
                addItem(item);
            }
        } catch (IOException ioe) {
            Log.e("Deu erro", "Mesmo!!!!!");
        }
    }
}
