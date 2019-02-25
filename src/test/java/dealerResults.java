import org.junit.Assert;
import org.junit.Test;

public class dealerResults {
    Blackjack bj = new Blackjack();
    @Test
    public void dealerWins(){
        Assert.assertEquals("Dealer did not win","d",bj.play(15,21));
        Assert.assertEquals("d",bj.play(18,21));
        Assert.assertEquals("d",bj.play(17,18));
    }
    @Test public void playerBust(){

        Assert.assertEquals("player was not bust","d",bj.play(27,18));
    }

}
