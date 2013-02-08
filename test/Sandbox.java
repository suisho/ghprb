import antlr.ANTLRException;
import com.coravy.hudson.plugins.github.GithubProjectProperty;
import hudson.model.AbstractProject;
import hudson.model.Build;
import hudson.model.Project;
import org.jenkinsci.plugins.ghprb.GhprbTrigger;
import org.junit.Test;
import org.mockito.Mockito;


import java.io.IOException;

/**
 * @author: syota_suzuki
 * @created: 13/02/08 18:48
 */
public class Sandbox {
    @Test
    public void hoge(){
        try {
            AbstractProject<?,?> mock = Mockito.mock(AbstractProject.class);
            GithubProjectProperty ghpp = new GithubProjectProperty("http://github.com/suisho/ghprb");
            try {
                mock.addProperty(ghpp);
            } catch (IOException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
            GhprbTrigger trg = new GhprbTrigger("a","b","c","d");
            trg.start(mock,true);
        } catch (ANTLRException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
