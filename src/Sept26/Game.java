package Sept26;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
    int sun;
    List<Plant> plants;
    List<Zombie> zombies;
    boolean last_zombies = false;
    Game() {
        plants = new ArrayList<>();
        zombies = new ArrayList<>();
        sun = 500;
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

        Scanner sc = new Scanner(System.in);
        while (true) {
            time++;
            if (time % 5 == 0 && zombies.isEmpty()) {
                Random rand = new Random();
                addZombies(new BucketheadZombie(), rand.nextInt(5)+1);
                addZombies(new BucketheadZombie(), rand.nextInt(5)+1);
                addZombies(new BucketheadZombie(), rand.nextInt(5)+1);
                if (time == 50) {
                    last_zombies = true;
                }
            }
            for (Plant p : plants) {
                List<Zombie> dead_zombies = new ArrayList<>();
                if (time % p.cooldown == 0) {
                    if (p instanceof SunProducer) {
                        sun += ((SunProducer) p).generate_sun();
                    }
                    if (p instanceof MagnetShroom && !((MagnetShroom) p).is_asleep) {
                        zombies.sort(new ZombiePlantComparator(p));
                        for (Zombie z : zombies) {
                            if (z instanceof HasMetallic && ((HasMetallic) z).isActive()) {
                                ((MagnetShroom) p).absorb_metal((HasMetallic) z);
                                break;
                            }
                        }

                    }
                    if (p instanceof Peashooter) {
                        for (Zombie z : zombies) {
                            if (z.location.row == p.location.row) {
                                z.take_damage(((Peashooter) p).shoot());
                                if (z.is_dead()) {
                                    dead_zombies.add(z);
                                    dead_zombies.indexOf(z);
                                    dead_zombies.add(1, z);
                                }
                                break;
                            }
                        }
                        zombies.removeAll(dead_zombies);
                        if (zombies.isEmpty() && last_zombies) {
                            System.out.println("You get another plant!");
                            return;
                        }
                    }
                    if (p instanceof CoffeeBean) {
                        for (Plant p1 : plants) {
                            if (p1.same_coord(p) && p1 instanceof Mushroom && ((Mushroom) p1).is_asleep) {
                                ((Mushroom) p1).wake_up((CoffeeBean) p);
                            }
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
            int choice = 0;
            Plant p = null;
            do {
                System.out.print("ADD PLANTS? ");
                System.out.print("1-Sunflower, 2-Peashooter, 3-STOP: ");
                try {
                    choice = sc.nextInt();
                } catch (Exception e) {
                    choice = 9999;
                }
                switch (choice) {
                    case 9:
                        break;
                    case 1:
                        p = new Sunflower();
                        break;
                    case 2:
                        p = new Peashooter();
                        break;
                    case 3:
                        p = new MagnetShroom();
                        break;
                    case 4:
                        p = new CoffeeBean();
                        break;
                    default:
                        System.out.println("None of the choices");
                        break;
                }
                if (choice == 9) {
                    break;
                }
                if (p != null) {
                    if (sun < p.sun_cost) {
                        System.out.println("Insufficient sun");
                        continue;
                    }
                    sun -= p.sun_cost;
                    System.out.print("Coords: ");
                    p.location = new Coord(sc.nextInt(), sc.nextInt());
                    plants.add(p);
                    break;
                }
            } while (choice != 3);
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
