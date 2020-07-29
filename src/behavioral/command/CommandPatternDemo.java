package behavioral.command;

/**
 * 命令模式
 */
public class CommandPatternDemo {

    public static void main(String args[]){
        Stock abcstock = new Stock();
        BuyStock buyStock = new BuyStock(abcstock);
        SellStock sellStock = new SellStock(abcstock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.placeOrders();
    }
}
