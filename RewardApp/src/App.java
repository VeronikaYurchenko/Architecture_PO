import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Fabric.GemGenerator;
import Fabric.GoldGenerator;
import Fabric.ItemGenerator;
import Fabric.BronzeGenerator;
import Fabric.PlatinumGenerator;
import Fabric.RubyGenerator;
import Fabric.SilverGenerator;
import Fabric.SapphireGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        ItemGenerator f1 = new GoldGenerator();
        f1.openReward();
        ItemGenerator f2 = new GemGenerator();
        f2.openReward();
        ItemGenerator f3 = new BronzeGenerator();
        f3.openReward();
        ItemGenerator f4 = new RubyGenerator();
        f4.openReward();
        ItemGenerator f5 = new SilverGenerator();
        f5.openReward();
        ItemGenerator f6 = new SapphireGenerator();
        f6.openReward();
        ItemGenerator f7 = new PlatinumGenerator();
        f7.openReward();

        List<ItemGenerator> generators = new ArrayList<>();

        generators.add(new GoldGenerator());

        generators.add(new GemGenerator());

        generators.add(new BronzeGenerator());

        generators.add(new RubyGenerator());

        generators.add(new SilverGenerator());

        generators.add(new PlatinumGenerator());

        generators.add(new SapphireGenerator());


        Random random = ThreadLocalRandom.current();
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(2);
            generators.get(index).openReward();
        }

    }
}