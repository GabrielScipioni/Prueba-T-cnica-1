package gabri.com;

public class DNA {
    String[] typeDna = {"AAAA", "TTTT", "GGGG", "CCCC"};
    public Type Type;

    public boolean isMutant(String[] dna) {
        int aux = 0;
        if (horizontal(dna)) {
            aux = aux + 1;
        }
        if (vertical(dna)) {
            aux = aux + 1;
        }
        if (oblique(dna)) {
            aux = aux + 1;
        }
        if (aux >= 2) {
            changeType();
            return true;
        }
        return false;
    }

    public DNA() {
        this.Type = gabri.com.Type.HUMAN;
    }

    public void changeType() {
        this.Type = gabri.com.Type.MUTANT;
    }

    private boolean horizontal(String[] dna) {
        int n = dna.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - 4; j++) {
                char first = dna[i].charAt(j);
                if (first == dna[i].charAt(j + 1) && first == dna[i].charAt(j + 2) && first == dna[i].charAt(j + 3)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean vertical(String[] dna) {
        int n = dna.length;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i <= n - 4; i++) {
                char first = dna[i].charAt(j);
                if (first == dna[i + 1].charAt(j) && first == dna[i + 2].charAt(j) && first == dna[i + 3].charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean oblique(String[] dna) {
        int n = dna.length;

        // Check from top-left to bottom-right
        for (int i = 0; i <= n - 4; i++) {
            for (int j = 0; j <= n - 4; j++) {
                char first = dna[i].charAt(j);
                if (first == dna[i + 1].charAt(j + 1) && first == dna[i + 2].charAt(j + 2) && first == dna[i + 3].charAt(j + 3)) {
                    return true;
                }
            }
        }

        // Check from bottom-left to top-right
        for (int i = 3; i < n; i++) {
            for (int j = 0; j <= n - 4; j++) {
                char first = dna[i].charAt(j);
                if (first == dna[i - 1].charAt(j + 1) && first == dna[i - 2].charAt(j + 2) && first == dna[i - 3].charAt(j + 3)) {
                    return true;
                }
            }
        }

        return false;
    }
}
