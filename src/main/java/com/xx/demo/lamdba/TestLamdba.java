package com.xx.demo.lamdba;

import com.xx.demo.HeoChecker.HeroChecker;
import com.xx.demo.pojo.Hero;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("s")
public class TestLamdba {
    public void testlamdba(){
        Random random = new Random();
        List<Hero> heroes = new ArrayList<>();
        for(int i=0;i<10;i++){
            heroes.add(new Hero("hero"+i,random.nextInt(1000),random.nextInt(100)));
        }
        System.out.println(heroes);
        System.out.println("筛选出英雄血量>100 && 英雄伤害<50 的英雄");

        HeroChecker heroChecker = hero -> (hero.getHp()>100 && hero.getDamage()<50);
        filter(heroes,heroChecker);
    }

    public static void filter(List<Hero> heroes,HeroChecker checker){
        for(Hero hero : heroes){
            if(checker.test(hero)){
                System.out.println(hero.toString());
            }
        }
    }
}
