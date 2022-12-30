package org.example.soundsystem;

import org.springframework.stereotype.Component;

/**
 * @author gedechang
 * @date 2022/12/30 21:56
 * @description CD的一个具体实现
 */
@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
