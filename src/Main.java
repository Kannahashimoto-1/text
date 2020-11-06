public class Main {
    public static void main(String[] args) {
        YangQingHan yangQingHan = new YangQingHan();
        JingDongStore jingDongStore = new JingDongStore();
        yangQingHan.buyComputer();
        jingDongStore.receiveOrder();
        jingDongStore.setYangQingHan(yangQingHan);
        jingDongStore.sendOrder();
        jingDongStore.informOrder();
        yangQingHan.receiveComputer();
        yangQingHan.learnJava();
    }
}
