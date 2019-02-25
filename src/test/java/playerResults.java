import org.junit.Assert;
import org.junit.Test;

public class playerResults {
    Blackjack bj = new Blackjack();
    @Test
    public void dealerBust(){
        Assert.assertEquals("p",bj.play(15,27));
    }
    @Test public void playerGreater(){
        Assert.assertEquals("p",bj.play(21,20));
    }
}
