package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testTreeStructure() {
        Squirrel cheeks = new Squirrel("Cheeks");
        Squirrel squeaks = new Squirrel("Squeaks");
        Squirrel fluffybutt = new Squirrel("Mr. Fluffy Butt");

        Node nodeOne = new Node(cheeks);
        Node nodeTwo = new Node(squeaks);
        Node nodeThree = new Node(fluffybutt);

        nodeOne.setLeft(nodeTwo);
        nodeOne.setRight(nodeThree);

        assertEquals("Squeaks", nodeOne.left().getData().getName());
        assertEquals("Mr. Fluffy Butt", nodeOne.right().getData().getName());
        assertEquals("Cheeks", nodeOne.getData().getName());
    }
}