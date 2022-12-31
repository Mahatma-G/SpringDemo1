package org.example.soundsystem;

/**
 * @author gedechang
 * @date 2022/12/31 13:55
 * @description
 */
public class BlankDisc implements CompactDisc{
    private String title;
    private String artist;

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
