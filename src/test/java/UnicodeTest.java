import encryptDecrypt.encodeMethods.Shift;
import encryptDecrypt.encodeMethods.Unicode;
import org.junit.Assert;
import org.junit.Test;

public class UnicodeTest {

    @Test
    public void testEncodingUsingMethodUnicode() {
        Unicode unicode = new Unicode();
        String actual = unicode.encode("Welcome to hyperskill!", 5).toString().replace('|', '\\');
        Assert.assertEquals("\\jqhtrj%yt%m~ujwxpnqq&", actual);
    }

    @Test
    public void testDecodingUsingMethodUnicode() {
        Unicode unicode = new Unicode();
        String actual = unicode.decode("\\jqhtrj%yt%m~ujwxpnqq&", 5).toString().replace('|', '\\');
        Assert.assertEquals("Welcome to hyperskill!", actual);
    }


}
