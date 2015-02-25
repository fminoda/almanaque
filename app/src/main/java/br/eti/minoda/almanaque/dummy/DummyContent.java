package br.eti.minoda.almanaque.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        // Add 4 sample items.
        addItem(new DummyItem("1", "Sr. Joao", "a"));
        addItem(new DummyItem("2", "Dona Maria", "b"));
        addItem(new DummyItem("3", "Tia Gertrudes", "c"));
        addItem(new DummyItem("4", "Dona Marocas", "d"));
        addItem(new DummyItem("5", "Sr. Joao 2", "e"));
        addItem(new DummyItem("6", "Dona Maria 2", "f"));
        addItem(new DummyItem("7", "Tia Gertrudes 2", "g"));
        addItem(new DummyItem("8", "Dona Marocas 2", "h"));
        addItem(new DummyItem("9", "Sr. Joao 3", "i"));
        addItem(new DummyItem("10", "Dona Maria 3", "j"));
        addItem(new DummyItem("11", "Tia Gertrudes 3", "k"));
        addItem(new DummyItem("12", "Dona Marocas 3", "l"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String content;
        public String lixo;

        public DummyItem(String id, String content, String lixo) {
            this.id = id;
            this.content = content;
            this.lixo = lixo;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
