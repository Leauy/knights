package com.nsfocus.music;

import com.nsfocus.knights.Quest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayConfig.class)
public class AutoWiringConfigTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CDPlayConfig.class);
        CompactDisc compactDisc = context.getBean(SgtPeppers.class);
        compactDisc.play();
        context.close();
    }

    @Autowired
    private CompactDisc cd;
    @Autowired
    private Quest quest;

    @Test
    public void testAutowired(){
        assertNotNull(quest);
        assertNotNull(cd);
    }

    @Autowired
    private CDPlayer cdPlayer;

    @Test
    public void play(){
        cdPlayer.play();
    }
}
