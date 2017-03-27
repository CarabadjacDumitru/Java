package com.Collection.Tree;

/**
 * Created by dimon on 3/27/2017.
 */
public class MainTree {

    public static void main(String[] args) {
        Node treeRootNode = new Node(null);
        treeRootNode.setId("root");
        // add child to root node
        Node childNode= addChild(treeRootNode, "child-1");
        // add child to the child node created above
        addChild(childNode, "child-11");
        addChild(childNode, "child-12");


        // add child to root node
        Node child2 = addChild(treeRootNode, "child-2");
        // add child to the child node created above
        addChild(child2, "child-21");


        printTree(treeRootNode, " ");
    }
}
