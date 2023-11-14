public class Review01 {
    public static void main(String[] args) {
        int price = 1000;
        double tax = tax(price);
        double total = price + tax;
        System.out.println(price + "円の商品の税込価格は" + total + "円（消費税は" + tax + "円）です。");
    }

    public static double tax(double price) {
        double result = price * 0.1;
        return result;
    }
}
