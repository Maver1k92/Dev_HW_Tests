import java.util.List;
import java.util.Map;

public class Shop {
    static List<Goods> goodsList ;

    static void fillShop(){

    }

    static double calculateTotalCost( String str) {
        double result = 0;
        char[] names = getGoodsNames(str);
        Map<String, Integer> products = getProductQuantity(names);
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            result += getProductCost(entry.getKey(), entry.getValue());
        }
        return result;
    }



    public static void main(String[] args) {
        fillShop();
        double totalCost = calculateTotalCost("ABCD");

    }

    static char[] getGoodsNames(String str) {
        return str.toCharArray();
    }
}
