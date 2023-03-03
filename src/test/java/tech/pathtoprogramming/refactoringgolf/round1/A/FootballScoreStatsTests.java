package tech.pathtoprogramming.refactoringgolf.round1.A;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static tech.pathtoprogramming.refactoringgolf.round1.A.FootballScoreStatsTests.TeamAssertions.the;

class FootballScoreStatsTests {

    @Test
    void totalsFootballScoresForTeam() {
        the().teamTotalFor("Liverpool").is(6);
        the().teamTotalFor("Everton").is(0);
        the().teamTotalFor("Aston Villa").is(1);
        the().teamTotalFor("West Ham").is(1);
    }

    static class TeamAssertions {

        private final FootballScoreStats stats = new FootballScoreStats();

        private String teamName;

        private TeamAssertions() {
        }

        public static FootballScoreStatsTests.TeamAssertions the() {
            return new FootballScoreStatsTests.TeamAssertions();
        }

        public FootballScoreStatsTests.TeamAssertions teamTotalFor(String teamName) {
            this.teamName = teamName;
            return this;
        }

        public void is(int score) {
            int teamTotal = stats.teamTotal(this.teamName);
            assertThat(teamTotal)
                    .isEqualTo(score);
        }
    }
}
