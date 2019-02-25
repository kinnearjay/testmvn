import org.junit.Assert;
import org.junit.Test;

public class miscResults {
    Blackjack bj = new Blackjack();
    @Test
    public void invalidScore( ){
        Assert.assertEquals("-1",bj.play(32,44));
        Assert.assertEquals("-1",bj.play(55,33));

    }
    @Test public void bothBust(){
        Assert.assertEquals("0",bj.play(22,22));
    }

}
