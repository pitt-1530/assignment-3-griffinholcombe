package edu.pitt.se;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlaylistRecommenderTest {

    @Test
    public void placeholder() {
        assertTrue(true);
    }

    // Tests for classifyEnergy()
    
    @Test
    public void testClassifyEnergyHigh() {
        // Avg = 150, should return "HIGH"
        List<Integer> bpms = Arrays.asList(140, 150, 160);
        assertEquals("HIGH", PlaylistRecommender.classifyEnergy(bpms));
    }

    @Test
    public void testClassifyEnergyMedium() {
        // Avg = 120, should return "MEDIUM"
        List<Integer> bpms = Arrays.asList(100, 120, 140);
        assertEquals("MEDIUM", PlaylistRecommender.classifyEnergy(bpms));
    }

    @Test
    public void testClassifyEnergyLow() {
        // Avg = 80, should return "LOW"
        List<Integer> bpms = Arrays.asList(70, 80, 90);
        assertEquals("LOW", PlaylistRecommender.classifyEnergy(bpms));
    }

    @Test
    public void testClassifyEnergyBoundaryHigh() {
        // Avg = 140, should return "HIGH" (boundary case)
        List<Integer> bpms = Arrays.asList(140);
        assertEquals("HIGH", PlaylistRecommender.classifyEnergy(bpms));
    }

    @Test
    public void testClassifyEnergyBoundaryMedium() {
        // Avg = 100, should return "MEDIUM" (boundary case)
        List<Integer> bpms = Arrays.asList(100);
        assertEquals("MEDIUM", PlaylistRecommender.classifyEnergy(bpms));
    }

    @Test
    public void testClassifyEnergyBoundaryBelowMedium() {
        // Avg = 99, should return "LOW" (boundary case)
        List<Integer> bpms = Arrays.asList(99);
        assertEquals("LOW", PlaylistRecommender.classifyEnergy(bpms));
    }

    @Test
    public void testClassifyEnergyNullList() {
        assertThrows(IllegalArgumentException.class, () -> {
            PlaylistRecommender.classifyEnergy(null);
        });
    }

    @Test
    public void testClassifyEnergyEmptyList() {
        assertThrows(IllegalArgumentException.class, () -> {
            PlaylistRecommender.classifyEnergy(Collections.emptyList());
        });
    }
}
