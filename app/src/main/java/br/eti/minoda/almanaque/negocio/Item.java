package br.eti.minoda.almanaque.negocio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class para representação de um item manipulado pelo Almanaque.
 */
public class Item {

    public String id;
    public TipoItem tipoItem;
    public String descricao;
    public String lixo;

    public Item(String id, TipoItem tipoItem, String descricao, String lixo) {
        this.id = id;
        this.tipoItem = tipoItem;
        this.descricao = descricao;
        this.lixo = lixo;
     }

    public String getId() {
        return id;
    }

    public TipoItem getTipoItem() {
        return tipoItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getLixo() {
        return lixo;
    }

    @Override
    public String toString() {
        return "Item{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
