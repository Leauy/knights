package com.nsfocus.knights.config;

import com.nsfocus.knights.DamselResuingKnight;
import com.nsfocus.knights.Knight;
import com.nsfocus.knights.Quest;
import com.nsfocus.knights.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {
    @Bean
    public Knight knight(){
        return new DamselResuingKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }
}
