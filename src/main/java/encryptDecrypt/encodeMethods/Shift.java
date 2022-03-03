package encryptDecrypt.encodeMethods;

import encryptDecrypt.AlgorithmMethod;

public class Shift implements AlgorithmMethod {
    private StringBuilder res;

    public Shift() {
        res = new StringBuilder();
    }

    @Override
    public StringBuilder encode(String input, int key) {
        for(char c : input.toCharArray()){
            if (c == ' ' || c == '!') {
                res.append(c);
                continue;
            }

            if ((int) c + key > 122 || (int) c + key < 97)
                res.append((char) ((int) c + key - 122 + 97 - 1));
            else
                res.append((char) (c + key));
        }

        return res;
    }

    @Override
    public StringBuilder decode(String input, int key) {
        for(char c : input.toCharArray()){
            if (c == ' ' || c == '!') {
                res.append(c);
                continue;
            }
            if ((int) c - key < 97)
                res.append((char) ((int) c - key + 122 - 97 + 1));
            else
                res.append((char) (c - key));
        }

        return res;
    }
}
