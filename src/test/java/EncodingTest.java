import encryptDecrypt.encodeMethods.Shift;
import encryptDecrypt.encodeMethods.Unicode;
import org.junit.Assert;
import org.junit.Test;

public class EncodingTest {

    @Test
    public void testEncodingUsingMethodShift() {
        Shift shift = new Shift();
        String actual = shift.encode("Welcome to hyperskill!", 5).toString().replace('|', '\\');
        Assert.assertEquals("Bjqhtrj yt mdujwxpnqq!", actual);
    }

    @Test
    public void testEncodingUsingMethodUnicode() {
        Unicode unicode = new Unicode();
        String actual = unicode.encode("Welcome to hyperskill!", 5).toString().replace('|', '\\');
        Assert.assertEquals("\\jqhtrj%yt%m~ujwxpnqq&", actual);
    }


}
