public class CodingBatBlackjack {

    public int blackjack(int a, int b) {
        if (Math.abs(a - 21) < Math.abs(b - 21) && a < 21 && b < 21) {
            if (a > 21) {
                return 0;
            } else {
                return a;
            }
        } else if (Math.abs(a - 21) > Math.abs(b - 21) && b < 21 && a < 21) {
            if (b > 21) {
                return 0;
            } else {
                return b;
            }
        } else {
            if (a == b) {
                if (a > 21) {
                    return 0;
                } else {
                    return a;
                }
            }
            if (a > 21) {
                if (Math.abs(a - 21) > Math.abs(b - 21)) {
                    if (b > 21) {
                        return 0;
                    } else {
                        return b;
                    }
                } else {
                    return 0;
                }
            } else {
                if (b > 21) {
                    return 0;
                } else {
                    return b;
                }
            }
        }
    }
}