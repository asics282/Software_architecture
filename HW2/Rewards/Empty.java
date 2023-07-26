package HW2.Rewards;

import HW2.iGetItem;

public class Empty implements iGetItem {

    @Override
    public void open() {
        System.out.println("Empty!");
    }
}
