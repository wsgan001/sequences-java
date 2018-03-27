package org.nnc.sequences;

import java.util.Map;

/**
 * Дерево ключей (Trie). Ключ представляет собой последовательность от корня до узла дерева,
 * содержащего значение.
 *
 * @param <E> Тип элемента ключа (исходной последовательности).
 * @param <V> Тип значения ключа.
 */
public interface Trie<E, V> {
    /**
     * Возвращает дочерние узлы.
     *
     * @return Дочерние узлы.
     */
    Map<E, ? extends Trie<E, V>> getChildren();

    /**
     * Возвращает значение ключа.
     *
     * @return Значение ключа.
     */
    V getValue();
}
