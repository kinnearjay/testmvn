import org.junit.Assert;
import org.junit.Test;

public class miscResults {
    Blackjack bj = new Blackjack();
    @Test
    public void invalidScore( ){
        Assert.assertEquals("the score was not invalid","-1",bj.play(32,44));
        Assert.assertEquals("the score was not invalid","-1",bj.play(55,33));

    }
    @Test public void bothBust(){
        Assert.assertEquals("both players were not bust?","0",bj.play(22,22));
    }

}
