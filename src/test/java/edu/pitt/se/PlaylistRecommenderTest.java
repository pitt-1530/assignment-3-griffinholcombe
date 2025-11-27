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

    // classifyEnergy tests
    @Test
    public void testClassifyEnergy_highBpm() {
        List<Integer> bpms = Arrays.asList(150, 160, 140);
        assertEquals("HIGH", PlaylistRecommender.classifyEnergy(bpms));
    }

    @Test
    public void testClassifyEnergy_mediumBpm() {
        List<Integer> bpms = Arrays.asList(100, 120, 130);
        assertEquals("MEDIUM", PlaylistRecommender.classifyEnergy(bpms));
    }

    @Test
    public void testClassifyEnergy_lowBpm() {
        List<Integer> bpms = Arrays.asList(80, 90, 85);
        assertEquals("LOW", PlaylistRecommender.classifyEnergy(bpms));
    }

    @Test
    public void testClassifyEnergy_exactlyAt140() {
        List<Integer> bpms = Arrays.asList(140, 140, 140);
        assertEquals("HIGH", PlaylistRecommender.classifyEnergy(bpms));
    }

    @Test
    public void testClassifyEnergy_exactlyAt100() {
        List<Integer> bpms = Arrays.asList(100, 100, 100);
        assertEquals("MEDIUM", PlaylistRecommender.classifyEnergy(bpms));
    }

    @Test
    public void testClassifyEnergy_nullList() {
        assertThrows(IllegalArgumentException.class, () -> {
            PlaylistRecommender.classifyEnergy(null);
        });
    }

    @Test
    public void testClassifyEnergy_emptyList() {
        assertThrows(IllegalArgumentException.class, () -> {
            PlaylistRecommender.classifyEnergy(Collections.emptyList());
        });
    }
}
