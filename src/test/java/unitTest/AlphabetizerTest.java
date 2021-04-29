package unitTest;

import com.virginatech.Alphabetizer;
import org.junit.Assert;
import org.junit.Test;

public class AlphabetizerTest {

    Alphabetizer alphabetizer = new Alphabetizer();

    @Test
    public void testAlphabetizerWithNull() {
        Assert.assertNull(alphabetizer.alphabetizer(null));
        Assert.assertNull(alphabetizer.alphabetizer(""));
    }

    @Test
    public void testAlphabetizerWithAllUpperCase() {
        Assert.assertEquals("AAHHJLMNSU", alphabetizer.alphabetizer("MUNJAL SHAH"));
    }

    @Test
    public void testAlphabetizerWithAllLowerCase() {
        Assert.assertEquals("aahhjlmnsu", alphabetizer.alphabetizer("munjal shah"));
    }

    @Test
    public void testAlphabetizerWithCaseInsensitive() {
        Assert.assertEquals("aahhjlMnSu", alphabetizer.alphabetizer("Munjal Shah"));
    }

    @Test
    public void testAlphabetizerWithNonAlphabeticCharacters() {
        Assert.assertEquals("hhjlMnu", alphabetizer.alphabetizer("123456789 Munj@l $h@h 987654321"));
    }

    @Test
    public void testAlphabetizer() {
        Assert.assertEquals("aceghiiinrTV", alphabetizer.alphabetizer("VirginiaTech"));
        Assert.assertEquals("BcdeiilMn", alphabetizer.alphabetizer("3 Blind Mice"));
    }
}
