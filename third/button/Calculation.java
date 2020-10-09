package third.button;

public interface Calculation {
    default int sum(int x, int y) {
        return this.sumAll(x, y);
    }

    default int sum(int x, int y, int z) {
        return this.sumAll(x, y, z);
    }

    private  int sumAll(int... values) {
        int res = 0;
        int[] var3 = values;
        int var4 = values.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            int n = var3[var5];
            res += n;
        }

        return res;
    }
}
