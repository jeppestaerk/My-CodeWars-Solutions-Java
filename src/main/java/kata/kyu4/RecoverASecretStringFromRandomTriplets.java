package kata.kyu4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class RecoverASecretStringFromRandomTriplets {
    public String recoverSecret(char[][] triplets) {
        List<Character> secret = new ArrayList<>();
        for (int i = 0; i < triplets.length; i++) {
            char[] triplet = triplets[i];
            handleTriplet(secret, triplet);
        }
        for (int i = triplets.length - 1; i >= 0; i--) {
            char[] triplet = triplets[i];
            handleTriplet(secret, triplet);
        }
        return secret.stream().map(Object::toString).collect(Collectors.joining());
    }

    private void handleTriplet(List<Character> secret, char[] triplet) {
        Boolean pristine = true;
        for (char ch : triplet) if (secret.contains(ch)) pristine = false;
        if (pristine) {
            for (char ch : triplet) {
                secret.add(ch);
            }
        } else {
            for (int i = 0; i < triplet.length; i++) {
                if (secret.contains(triplet[i]) && i < triplet.length - 1) {
                    if (!secret.contains(triplet[i + 1])) secret.add(secret.indexOf(triplet[i]), triplet[i + 1]);
                    else if (secret.indexOf(triplet[i]) > secret.indexOf(triplet[i + 1])) {
                        secret.remove(secret.indexOf(triplet[i]));
                        secret.add(secret.indexOf(triplet[i + 1]), triplet[i]);
                    }
                }
                if (secret.contains(triplet[i]) && i > 0) {
                    if (!secret.contains(triplet[i - 1])) secret.add(secret.indexOf(triplet[i]), triplet[i - 1]);
                    else if (secret.indexOf(triplet[i]) < secret.indexOf(triplet[i - 1])) {
                        secret.remove(secret.indexOf(triplet[i]));
                        secret.add(secret.indexOf(triplet[i - 1]) + 1, triplet[i]);
                    }
                }
            }
        }
    }
}
