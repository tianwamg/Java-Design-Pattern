package behavioral.command;

public class SellStock implements Order {

    private Stock abcstock;

    public SellStock(Stock stock){
        this.abcstock = stock;
    }
    @Override
    public void execute() {
        abcstock.sell();
    }
}
