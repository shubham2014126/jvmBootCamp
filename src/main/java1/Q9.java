public class Q9 {

    public enum House {
        onebhk(4), TWOBHK(2), THREEBHK(3), BUNGALOW(5);

        House(int price) {
            this.price = price;
        }

        private final int price;

        public int getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        for (House h : House.values()) {
            System.out.println("House: " + h + ", ");

            if (h.getPrice() >= 4) {
                System.out.println("Expensive, ");
            } else {
                System.out.println("Affordable, ");
            }
        }
    }


}
