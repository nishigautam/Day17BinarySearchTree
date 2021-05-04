package com.binarysearchtree;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class BinarySearchTree {

    /**
     * uc1 testcase
     */
    @Test
    public void Elements_Added_Returns_Size3() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);
        Assert.assertEquals(3, binaryTree.size());
    }
}
