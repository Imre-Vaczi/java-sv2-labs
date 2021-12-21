package enumabstract;

public enum Discount {

    SPECIAL_OFFER {
        @Override
        public double getAmountToPay(int price, int pieces) {
            return price * (1 - 0.2) * pieces;
        }
    }, BLACK_FRIDAY_OFFER {
        @Override
        public double getAmountToPay(int price, int pieces) {
            if (pieces < 1) {
                return 0;
            } else if (pieces == 1 | pieces == 2) {
                return price * (1- 0.25) * pieces;
            } else {
                return price * (1- 0.25) * (pieces - 1) + price * (1- 0.5);
            }
        }
    };

    public abstract double getAmountToPay(int price, int pieces);
}
