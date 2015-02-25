package br.eti.minoda.almanaque.negocio;

/**
 * Tipificacao de itens manipulados pelo Almanaque.
 *
 * Created by minoda on 20/10/14.
 */
public enum TipoItem {
    PESSOA(1, "Pessoa"),
    LOCAL (2,"Local");

    private int id;
    private String descr;

    TipoItem(int id, String descr) {
        this.id = id;
        this.descr = descr;
    }


}
