import encryptDecrypt.encodeMethods.Shift;
import encryptDecrypt.encodeMethods.Unicode;
import org.junit.Assert;
import org.junit.Test;

public class ShiftTest {

    @Test
    public void testDecodingUsingMethodShift() {
        Shift shift = new Shift();
        String actual = shift.decode("Bjqhtrj yt mdujwxpnqq!", 5).toString().replace('|', '\\');
        Assert.assertEquals("Welcome to hyperskill!", actual);
    }

    @Test
    public void testEncodingUsingMethodShift() {
        Shift shift = new Shift();
        String actual = shift.encode("Welcome to hyperskill!", 5).toString().replace('|', '\\');
        Assert.assertEquals("Bjqhtrj yt mdujwxpnqq!", actual);
    }

}
