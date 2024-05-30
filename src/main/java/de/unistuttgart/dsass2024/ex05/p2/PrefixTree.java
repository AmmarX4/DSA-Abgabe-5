package de.unistuttgart.dsass2024.ex05.p2;

import java.util.HashMap;

public class PrefixTree implements IPrefixTree {
    private PrefixTreeNode root;
    private int size = 0;

    public PrefixTree() {
    }

    @Override
    public void insert(String word) {
        insertRecursive(root, word);
    }

    private void insertRecursive(PrefixTreeNode node, String word) {
        if (word.isEmpty()) {
            return;
        }
        char firstCharacter = word.charAt(0);
        IPrefixTreeNode child = node.getChild(firstCharacter);

        if (child == null) {
            PrefixTreeNode newChild = new PrefixTreeNode();
            newChild.setPrefix(node.getPrefix() + firstCharacter);
            node.setChild(firstCharacter, newChild);
            child = newChild;
            this.size++;
        }

        insertRecursive((PrefixTreeNode) child, word.substring(1));
    }

    @Override
    public int size() {
        return this.size;
    }

}