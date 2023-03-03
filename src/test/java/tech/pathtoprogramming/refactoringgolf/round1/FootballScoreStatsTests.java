package tech.pathtoprogramming.refactoringgolf.round1;

import org.junit.jupiter.api.Test;
import tech.pathtoprogramming.refactoringgolf.round1.A.FootballScoreStats;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FootballScoreStatsTests {

    @Test
    void totalsFootballScoresForTeam() {
        FootballScoreStats stats = new FootballScoreStats();
        assertEquals(6, stats.teamTotal("Liverpool"));
    }
}
