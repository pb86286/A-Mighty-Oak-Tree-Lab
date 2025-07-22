package org.example;

public class App {

    public static void main(String[] args) {
        Squirrel cheeks = new Squirrel("Cheeks");
        Squirrel squeaks = new Squirrel("Squeaks");
        Squirrel fluffybutt = new Squirrel("Mr. Fluffy Butt");

        Node nodeOne = new Node(cheeks);
        Node nodeTwo = new Node(squeaks);
        Node nodeThree = new Node(fluffybutt);
        
        nodeOne.setLeft(nodeTwo);
        nodeOne.setRight(nodeThree);
        
        Node retrievedLeft = nodeOne.left();
        Node retrievedRight = nodeOne.right();

        System.out.println("Left child of nodeOne: " + retrievedLeft.getData().getName());
        System.out.println("Right child of nodeOne: " + retrievedRight.getData().getName());
    }
}