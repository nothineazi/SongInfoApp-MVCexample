package com.company;

// ID 180041155

import java.util.Scanner;

public class ArtistView {
    private String songTitle;

    /**
     * This method takes the input from user directly.
     **/
    public void getInputFromUser()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter song title :");
        songTitle = scanner.nextLine();
    }

    /**
     * This method is used by controller to get the song title that the
     * user entered.
     *
     * @return*/
    public String getSongTitle()
    {
        return songTitle;
    }



    public void printSongDetails(String artistName,
                                 String yearOfRelease)
    {
        System.out.println("Song Info: ");
        System.out.println("Artist Name: " + artistName);
        System.out.println("Year Of Release: " + yearOfRelease);
    }

}
