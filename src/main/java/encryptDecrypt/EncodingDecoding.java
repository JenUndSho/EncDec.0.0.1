package encryptDecrypt;

public class EncodingDecoding {
    public AlgorithmMethod method;

    public void setMethod(AlgorithmMethod method) {
        this.method = method;
    }

    public String implement(String input, int key, String command) {
        if (command.equals("enc")) {
            return method.encode(input, key).toString().replace('|', '\\');
        } else if (command.equals("dec")) {
            return method.decode(input, key).toString().replace('|', '\\');
        }

        return null;
    }
}
