public class JingDongStore implements OnlineStore{
    private Buyer YangQingHan;
    public void setYangQingHan(Buyer buyer){
        this.YangQingHan=buyer;
    }

    @Override
    public void receiveOrder() {
        System.out.println("京东商铺接收到了一个订单");
    }

    @Override
    public void sendOrder() {
        try {
            System.out.println("你的外星人电脑正在派送中");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Computer computer = new Computer();
        computer.name="外星人";
        System.out.println(computer.name + "到货了");
        YangQingHan.receiveComputer();
    }

    @Override
    public void informOrder() {
        System.out.println("你的订单已到货了");
    }
}
