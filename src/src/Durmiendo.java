package src;

import java.util.Timer;
import java.util.TimerTask;

public class Durmiendo implements State {
    private Tamagotchi tamagotchi;

    @Override
    public void jugar() {
    }

    @Override
    public void alimentar() {
    }

    @Override
    public void dormir() {
    }

    @Override
    public void comoEstas() {
        System.out.println("(está durmiendo shh)");
    }

    @Override
    public void setTamagotchi(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Durmiendo.this.tamagotchi.setState(new Hambriento());
            }
        }, 7000);
    }
}
