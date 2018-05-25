import android.support.v4.util.Pair;
import android.test.AndroidTestCase;
import android.util.Log;
import com.udacity.gradle.builditbigger.EndpointsAsyncTask;
import com.udacity.gradle.javajoke.JokeTeller;

public class Testing extends AndroidTestCase {

    private static final String LOG_TAG = "NonEmptyStringTest";

    @SuppressWarnings("unchecked")
    public void test() {

        // Testing that Async task successfully retrieves a non-empty string
        Log.v("NonEmptyStringTest", "Running NonEmptyStringTest test");
        String result = null;
        JokeTeller joke = new JokeTeller();
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.execute(new Pair<>(getContext(), joke.getRandomJoke()));
        try {
            result = endpointsAsyncTask.get();
            Log.d(LOG_TAG, "Retrieved a non-empty string successfully: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }
}
