package com.kodilla.rps;

public class ShapeRecognizer {
    String userKey;
    Shape shape;
    int computersMove;

    public String getUserKey() {

        return userKey;
    }

    public void setUserKey(String userKey) {

        this.userKey = userKey;
    }


    public Shape recognize(String userKey) {
        if (userKey.equals("1")) {
            return new Rock();
        } else if (userKey.equals("2")) {
            return new Paper();
        } else if (userKey.equals("3")) {
            return new Scissors();
        } else {
            return null;
        }
    }
}