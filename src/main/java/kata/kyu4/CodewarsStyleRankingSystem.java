package kata.kyu4;

public class CodewarsStyleRankingSystem {
    public static class User {
        public int rank = -8;
        public int progress = 0;

        public void incProgress(int aRank) {
            if (aRank < -8 || aRank > 8 || aRank == 0) throw new IllegalArgumentException();
            if (this.rank < 0 && aRank > 0) aRank--;
            if (this.rank > 0 && aRank < 0) aRank++;
            if (aRank == this.rank) this.progress += 3;
            if (aRank == (this.rank - 1)) this.progress += 1;
            if (aRank <= (this.rank - 2)) this.progress += 0;
            if (aRank > this.rank) {
                int d = aRank - this.rank;
                this.progress += (10 * d * d);
            }
            if (this.progress >= 100) {
                while (this.progress >= 100 && this.rank < 8) {
                    if (++this.rank == 0) this.rank++;
                    this.progress -= 100;
                }
            }
            if (this.rank == 8 && this.progress > 0) {
                this.progress = 0;
            }
        }
    }
}
