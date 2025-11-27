package edu.pitt.se;

import java.util.List;

public class PlaylistRecommender {

    public static String classifyEnergy(List<Integer> bpms) {
        /*
         * Return "HIGH" if avg BPM ≥ 140
         * "MEDIUM" if 100–139
         * "LOW" if < 100
         * Reject null or empty lists
         */
        if (bpms.isEmpty() || bpms == null)
            return "Null";

        double avg = bpms.stream().mapToInt(Integer::intValue).average().getAsDouble();

        if (avg >= 140)
            return "HIGH";
        if (avg >= 100 && avg <= 139)
            return "MEDIUM";
        if (avg < 100)
            return "LOW";
        throw new UnsupportedOperationException("Not implemented");
    }

    public static boolean isValidTrackTitle(String title) {
        // Reject null
        if (title == null) {
            return false;
        }

        if (title.length() < 1 || title.length() > 30) {
            return false;
        }

        for (int i = 0; i < title.length(); i++) {
            char c = title.charAt(i);
            if (!Character.isLetter(c) && c != ' ') {
                return false;
            }
        }

        return true;
    }

    public static int normalizeVolume(int volumeDb) {
        // Clamp volume into range 0–100
        if (volumeDb < 0) {
            return 0;
        } else if (volumeDb > 100) {
            return 100;
        }
        return volumeDb;
    }
}
