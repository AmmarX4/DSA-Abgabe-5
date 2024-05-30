package de.unistuttgart.dsass2024.ex05.p2;

import java.util.HashMap;
import java.util.Set;

public class PrefixTreeNode implements IPrefixTreeNode {

    private String prefix;
    private HashMap<Character, IPrefixTreeNode> children;
    private Set<Character> labels;

    public PrefixTreeNode() {
        this.prefix = "";
        this.children = new HashMap<>();
    }

    @Override
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String getPrefix() {
        return prefix;
    }

    @Override
    public Set<Character> getLabels() {
        return children.keySet();
    }

    @Override
    public void setChild(char label, IPrefixTreeNode node) {
        children.put(label, node);
    }

    @Override
    public IPrefixTreeNode getChild(char label) {
        return children.get(label);
    }

    @Override
    public void removeChildren() {
        children.clear();
    }

}