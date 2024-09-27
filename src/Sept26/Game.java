package Sept26;

import java.util.ArrayList;
import java.util.List;

public class Game {
    int sun;
    List<Plant> plants;
    List<Zombie> zombies;
    Game() {
        plants = new ArrayList<>();
        zombies = new ArrayList<>();
        sun = 50;
    }

    void addZombies(Zombie z, int row) {
        zombies.add(z);
        z.location = new Coord(row);
    }

    void addPlant(Plant p, Coord location) {
        plants.add(p);
        p.location = location;
    }

    void startGame() throws InterruptedException {
        int time = 0;

        for (Plant p : plants) {
            if (p instanceof CoffeeBean) {
                for (Plant p1 : plants) {
                    if (p1.same_coord(p) && p1 instanceof Mushroom && p1.is_asleep) {
                        ((Mushroom) p1).wake_up((CoffeeBean) p);
                    }
                }
            }
        }
        while (true) {
            time++;
            for (Plant p : plants) {
                List<Zombie> dead_zombies = new ArrayList<>();
                if (time % 5 == 0) {
                    if (p instanceof Sunflower) {
                        sun += ((Sunflower) p).generate_sun();
                    }
                    if (p instanceof MagnetShroom && !p.is_asleep) {
                        for (Zombie z : zombies) {
                            if (z instanceof HasMetallic && ((HasMetallic) z).isActive()) {
                                ((MagnetShroom) p).absorb_metal((HasMetallic) z);
                            }
                        }

                    }
                }
                if (time % 2 == 0) {
                    if (p instanceof Peashooter) {
                        for (Zombie z : zombies) {
                            if (z.location.row == p.location.row) {
                                z.take_damage(((Peashooter) p).shoot());
                                if (z.is_dead()) {
                                    dead_zombies.add(z);
                                }
                                break;
                            }
                        }
                        zombies.removeAll(dead_zombies);
                        if (zombies.isEmpty()) {
                            System.out.println("You get another plant!");
                            return;
                        }
                    }
                }
            }
            for (Zombie z : zombies) {
                Plant e = hasPlantNearby(z);
                if (e != null) {
                    z.eat(e);
                    if (e.is_dead()) {
                        plants.remove(e);
                    }
                } else {
                    z.walk();
                    if (z.reachesHouse()) {
                        System.out.println("The Zombies Ate Your Brainzzz");
                        return;
                    }
                }
            }
            outputStatus();
            Thread.sleep(500);
        }
    }

    Plant hasPlantNearby(Zombie z) {
        for (Plant p : plants) {
            if (p.location.row == z.location.row &&
            p.location.col >= z.location.col-1 &&
                    p.location.col < z.location.col) {
                return p;
            }
        }
        return null;
    }

    private void outputStatus() {
        System.out.println("Sun: " + sun);
        System.out.println("List of Plants: ");
        for (Plant p : plants) {
            System.out.println(p);
        }
        System.out.println("LIST OF ZOMBIES: ");
        for (Zombie z : zombies) {
            System.out.println(z);
        }
    }
}
