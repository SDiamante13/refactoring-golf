package tech.pathtoprogramming.refactoringgolf.hole1.after;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static tech.pathtoprogramming.refactoringgolf.hole1.after.FootballScoreStatsTests.TeamAssertions.the;

class FootballScoreStatsTests {

    @Test
    void B_teamTotalsForStubbedData() {
        the().teamTotalFor("Liverpool").is(6);
        the().teamTotalFor("Everton").is(0);
        the().teamTotalFor("Aston Villa").is(1);
        the().teamTotalFor("West Ham").is(1);
    }

    static class TeamAssertions {

        private final FootballScoreStats stats = new FootballScoreStats(new FootballData());

        private String teamName;

        private TeamAssertions() {
        }

        public static TeamAssertions the() {
            return new TeamAssertions();
        }

        public TeamAssertions teamTotalFor(String teamName) {
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

