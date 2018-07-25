package androidTest;


import com.udacity.gradle.builditbigger.EndpointAsyncTask;
import com.udacity.gradle.builditbigger.MainActivityFragment;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class EndPointAsyncTaskTest {

    @Test
    public void testDoInBackground() throws Exception {
   MainActivityFragment fragment = new MainActivityFragment();
        fragment.testFlag = true;
        new EndpointAsyncTask().execute((Runnable) fragment);
        Thread.sleep(5000);
        assertTrue("Error: Fetched Joke = " + fragment.loadedJoke, fragment.loadedJoke != null);
    }
}