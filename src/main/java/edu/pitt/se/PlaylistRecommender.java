package edu.pitt.se;

import java.util.List;

public class PlaylistRecommender {

    public static String classifyEnergy(List<Integer> bpms) {
        if (bpms == null || bpms.isEmpty()) {
            throw new IllegalArgumentException("BPM list cannot be null or empty");
        }
        
        double average = bpms.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
        
        if (average >= 140) {
            return "HIGH";
        } else if (average >= 100) {
            return "MEDIUM";
        } else {
            return "LOW";
        }
    }

    public static boolean isValidTrackTitle(String title) {
        // TODO: Implement isValidTrackTitle()
        throw new UnsupportedOperationException("Not implemented");
    }

    public static int normalizeVolume(int volumeDb) {
        // TODO: Implement normalizeVolume()
        throw new UnsupportedOperationException("Not implemented");
    }
}
