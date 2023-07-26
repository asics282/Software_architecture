package HW2.Rewards;
import HW2.ItemGenerator;
import HW2.iGetItem;

public class EmptyFabric extends ItemGenerator{
    @Override
    public iGetItem createItem() {
        return new Empty();
    }
}
