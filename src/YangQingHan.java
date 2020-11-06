public class YangQingHan implements Buyer{
    @Override
    public void buyComputer() {
        System.out.println("杨清涵哥哥下单买了一台外星人电脑");
    }

    @Override
    public void receiveComputer() {
        System.out.println("杨清涵哥哥收到了一台外星人电脑");
    }

    @Override
    public void learnJava() {
        System.out.println("杨清涵哥哥拿到电脑后打开Java习题库并开始练习Java");
    }
}
