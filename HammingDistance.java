public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int hamDist = 0, i = 0;
        
        String xbin = Integer.toBinaryString(x);
        String ybin = Integer.toBinaryString(y);
        int xbinSize = xbin.length(), ybinSize = ybin.length();
        StringBuilder xbinPadded = new StringBuilder();
        StringBuilder ybinPadded = new StringBuilder();
        for (int j = 0 ; j < 32-xbinSize ; j++ ) xbinPadded.append('0');
        for (int k = 0 ; k < 32-ybinSize ; k++ ) ybinPadded.append('0');
        xbinPadded.append(xbin);
        ybinPadded.append(ybin);
    
        for (int l = 0; l < 32; l++) {
            if (xbinPadded.charAt(l) != ybinPadded.charAt(l))
                hamDist++;
            i++;
        }
        return hamDist;
    }
}
