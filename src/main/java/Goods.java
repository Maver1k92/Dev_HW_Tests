public class Goods {
    String name;
    int promotionalItemQuality;
    double price;
    double promotionalPrice;

    public static class Builder {
        private static Goods newGoods;

        public Builder () {
            newGoods = new Goods();
        }

        public Goods.Builder withName(String name) {
            newGoods.name = name;
            return this;
        }

        public Goods.Builder promotionalItemQuality(int quality) {
            newGoods.promotionalItemQuality = quality;
            return this;
        }

        public Goods.Builder withPrice(double price) {
            newGoods.price = price;
            return this;
        }

        public Goods.Builder withPromotionalPrice(double promotionalPrice) {
            newGoods.promotionalPrice = promotionalPrice;
            return this;
        }

        public Goods build() {
            return newGoods;
        }
    }
}
