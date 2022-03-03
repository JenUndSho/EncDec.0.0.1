package encryptDecrypt;

public interface AlgorithmMethod {

    StringBuilder encode(String input, int key);

    StringBuilder decode(String input, int key);
}
