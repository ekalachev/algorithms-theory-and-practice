    // int result = findMissing(new int[]{1,4,3,5,2,6}, new int[]{6,2,3,1,4}); // returns 5
    
    static int findMissing(int[] fullSet, int[] partialSet) {
        int xorSum = 0;
        for(int num: fullSet) {
            xorSum ^= num;
        }
        for(int num: partialSet) {
            xorSum ^= num;
        }

        return xorSum;
    }
