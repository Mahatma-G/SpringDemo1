package org.example.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author gedechang
 * @date 2022/12/30 22:01
 * @description CD配置文件
 */
@Configuration
//@ComponentScan("org.example.soundsystem")
//@ComponentScan(basePackages = "org.example.soundsystem")
//@ComponentScan(basePackageClasses = {CompactDisc.class})
public class CDPlayerConfig {
    @Bean(name = "lonelyHeartsClubBand")
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
//    @Bean
//    public CDPlayer cdPlayer() {
//        return new CDPlayer(sgtPeppers());
//    }
}
