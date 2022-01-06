package com.company;

// ID 180041155

public class Main {

    public static void main(String[] args) {
        ArtistView view = new ArtistView();
        ArtistModel model = new ArtistModel();
        ArtistController controller = new ArtistController(model, view);

        controller.getInputFromView();
        controller.getUserRequestedInfo();
        controller.updateView(); 
    }
}
