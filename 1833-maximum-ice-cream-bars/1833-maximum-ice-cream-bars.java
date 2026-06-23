class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max = 0;
        for (int cost : costs) {
            max = Math.max(max,cost);
        }
        
        int[] count = new int[max + 1];
        for (int cost : costs) {
            count[cost]++;
        }
        int ices = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                if (coins >= i) {
                    coins -= i;
                    ices++;
                } else return ices;
                count[i]--;
            }
        }
        
        return ices;
    }
}