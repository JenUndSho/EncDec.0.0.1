import encryptDecrypt.encodeMethods.Shift;
import encryptDecrypt.encodeMethods.Unicode;
import org.junit.Assert;
import org.junit.Test;

public class DecodingTest {

    @Test
    public void testDecodingUsingMethodShift() {
        Shift shift = new Shift();
        String actual = shift.decode("Bjqhtrj yt mdujwxpnqq!", 5).toString().replace('|', '\\');
        Assert.assertEquals("Welcome to hyperskill!", actual);
    }

    @Test
    public void testDecodingUsingMethodUnicode() {
        Unicode unicode = new Unicode();
        String actual = unicode.decode("\\jqhtrj%yt%m~ujwxpnqq&", 5).toString().replace('|', '\\');
        Assert.assertEquals("Welcome to hyperskill!", actual);
    }

}
