package com.company;

// ID 180041155

public class ArtistModel {

    private String artistName;
    private String yearOfRelease;


    public void setSongInfo(String songTitle)
    {
        String s = songTitle;
        if (s.equals("Billie Jean"))
        {
            this.artistName = "Micheal Jackson";
            this.yearOfRelease = "1982";
        }
        else
        {
            this.artistName = "Idk";
            this.yearOfRelease = "Irdk";
        }
    }

    public String getArtistName()
    {
        return artistName;
    }

    public String getYearOfRelease()
    {
        return yearOfRelease;
    }
}
