public class DutchNationalFlag {
    enum Pebble {
        Red,
        White,
        Blue
    }

    class Pockets {
        private Pebble[] pebble;

        private Pebble color(int i) {
            return pebble[i];
        }

        private int compare(Pebble p) {
            Pebble white = Pebble.White;
            return p.ordinal() - white.ordinal();
        }

        void swap(Pebble[] p, int p1, int p2) {
            Pebble swapper = p[p1];
            p[p1] = p[p2];
            p[p2] = swapper;
        }

        public void dutchNationalFlagSort(Pebble[] p) {
            int lo = 0;
            int mid = 0;
            int hi = pebble.length - 1;
            int i = 0;
            while (mid <= hi) {
                switch (p[mid]) {
                    case Red: {
                        swap(p, lo, mid);
                        lo++;
                        mid++;
                        break;
                    }
                    case White: {
                        mid++;
                        break;
                    }
                    case Blue: {
                        swap(p, mid, hi);
                        hi--;
                        break;
                    }
                }
            }
        }

        public static void main(String[] args) {

        }
    }
}
