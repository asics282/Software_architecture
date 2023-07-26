package HW2.Rewards;

import HW2.ItemGenerator;
import HW2.iGetItem;

public class ManaFabric extends ItemGenerator {
    @Override
    public iGetItem createItem() {
        return new Mana();
    }
}
