class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        String a = String.valueOf(k);
        for (int l = i; l <= j; l++) {
            String b = String.valueOf(l);
            if (b.contains(a)) {
                String[] array = b.split("");
                for (String c : array) {
                    if (c.equals(a)) count++;
                }
            }
        }
        return count;
    }
}