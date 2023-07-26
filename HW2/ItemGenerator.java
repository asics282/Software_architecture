package HW2;

public abstract class ItemGenerator {
    public void openReward(){
        iGetItem gameItem = createItem();
        gameItem.open();
    }
    public abstract iGetItem createItem();
}

