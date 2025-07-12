import java.util.Random;

public class Generator {
    private Random random = new Random();

    public Password generate(int length, boolean useUpper, boolean useLower, boolean useNumbers, boolean useSymbols) {
        StringBuilder pool = new StringBuilder();

        if (useUpper) pool.append(Digits.upper_case);
        if (useLower) pool.append(Digits.lower_case);
        if (useNumbers) pool.append(Digits.special_symbol);
        if (useSymbols) pool.append(Digits.digit);

        if (pool.length() == 0) throw new IllegalArgumentException("No character sets selected!");

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(pool.length());
            password.append(pool.charAt(index));
        }

        return new Password(password.toString());
    }
}
