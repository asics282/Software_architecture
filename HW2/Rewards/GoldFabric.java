package HW2.Rewards;
import HW2.ItemGenerator;
import HW2.iGetItem;

//Класс создание награды "Золото"
public class GoldFabric extends ItemGenerator{
    @Override
    public iGetItem createItem() {
        return new Gold();
    }
}
