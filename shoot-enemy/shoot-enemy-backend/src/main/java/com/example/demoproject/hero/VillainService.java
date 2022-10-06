package com.example.demoproject.hero;

import org.springframework.stereotype.Service;

@Service
public class VillainService extends HeroService {
    private int health = 100;
    private boolean armour = false;

    public int returnHealth() {
        return getHealth();
    }

    @Override
    public void shotByGunOne() {
        if(armour){
            this.health -= 20;
        }
        else {
            this.health -= 30;
        }

        if(this.health<=0){
            this.health = 100;
        }

    }

    @Override
    public void shotByGunTwo() {
        if(armour){
            this.health -= 40;
        }
        else{
            this.health -= 50;
        }

        if(this.health<=0){
            this.health = 100;
        }
    }

    @Override
    public void getHealed() {
        this.health+=50;
        if(health>=100){
            this.health = 100;
        }
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }


    public void setArmour(boolean armour) {
        this.armour = armour;
    }
}
