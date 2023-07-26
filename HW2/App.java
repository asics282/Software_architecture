package HW2;

import HW2.Rewards.EmptyFabric;
import HW2.Rewards.GemFabric;
import HW2.Rewards.GoldFabric;
import HW2.Rewards.ManaFabric;
import HW2.Rewards.WoodFabric;
import HW2.Rewards.EmptyFabric;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class App {
    public static void main(String[] args) {
        ItemGenerator fab = new GoldFabric();
        fab.openReward();
        ItemGenerator fab2 = new GemFabric();
        fab2.openReward();
        ItemGenerator fab3 = new ManaFabric();
        fab3.openReward();
        ItemGenerator fab4 = new WoodFabric();
        fab3.openReward();
        ItemGenerator fab5 = new EmptyFabric();
        fab3.openReward();

        //рандомайзер
        // Random rnd = ThreadLocalRandom.current();
        Random rnd = new Random();
        List<ItemGenerator> fabricList = new ArrayList<>();
        fabricList.add(fab);
        fabricList.add(fab2);
        fabricList.add(fab3);
        fabricList.add(fab4);
        fabricList.add(fab5);

        for (int i = 0; i < 10; i++) {
            // int index = Math.abs(rnd.nextInt()%2==0?0:5);
            int index = rnd.nextInt(fabricList.size());
            fabricList.get(index).openReward();
        }
    }
}
