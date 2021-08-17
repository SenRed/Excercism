class Hamming {

    private int hammingDistance = 0;

    public Hamming(String leftStrand, String rightStrand) {
        if (rightStrand.isEmpty() && leftStrand.isEmpty()) {
            return;
        }
        if (rightStrand.isEmpty()) {
            throw new IllegalArgumentException("right strand must not be empty.");
        }
        if (leftStrand.isEmpty()) {
            throw new IllegalArgumentException("left strand must not be empty.");
        }
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        final char[] leftStrandArray = leftStrand.toCharArray();
        for (int i = 0; i < leftStrandArray.length; i++) {
            if (leftStrandArray[i] != rightStrand.charAt(i)) {
                hammingDistance++;
            }
        }
    }

    public int getHammingDistance() {
        return hammingDistance;
    }
}
