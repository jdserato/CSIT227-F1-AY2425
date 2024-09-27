package Sept26;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();
        game.addPlant(new Sunflower(), new Coord(1, 1));
        game.addPlant(new Sunflower(), new Coord(2, 1));
        game.addPlant(new Sunflower(), new Coord(3, 1));
        game.addPlant(new Sunflower(), new Coord(4, 1));
        game.addPlant(new Sunflower(), new Coord(5, 1));
        game.addPlant(new Peashooter(), new Coord(1, 4));
        game.addPlant(new Peashooter(), new Coord(3, 4));
        game.addPlant(new Peashooter(), new Coord(5, 4));
        game.addPlant(new Peashooter(), new Coord(2, 4));
        game.addPlant(new Peashooter(), new Coord(4, 4));
        game.addPlant(new MagnetShroom(), new Coord(4, 6));
        game.addPlant(new CoffeeBean(), new Coord(4, 6));
        Random rand = new Random();
        game.addZombies(new Zombie(), rand.nextInt(5)+1);
        game.addZombies(new BucketheadZombie(), rand.nextInt(5)+1);
        game.addZombies(new Zombie(), rand.nextInt(5)+1);
        game.startGame();
    }
}
