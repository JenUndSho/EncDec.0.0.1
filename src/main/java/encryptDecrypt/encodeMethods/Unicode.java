package encryptDecrypt.encodeMethods;

import encryptDecrypt.AlgorithmMethod;

public class Unicode implements AlgorithmMethod {
    private StringBuilder res;

    public Unicode() {
        res = new StringBuilder();
    }

    @Override
    public StringBuilder encode(String input, int key) {
        for(char c : input.toCharArray()) {
            res.append((char) (c + key));
        }

        return res;
    }

    @Override
    public StringBuilder decode(String input, int key) {
        for(char c : input.toCharArray()) {
            res.append((char) (c - key));
        }

        return res;
    }
}
