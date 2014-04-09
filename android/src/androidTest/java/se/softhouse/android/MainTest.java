package se.softhouse.android;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;
import com.jayway.android.robotium.solo.Solo;
import junit.framework.Assert;

public class MainTest extends ActivityInstrumentationTestCase2<MainActivity> {
    private Solo solo;

    public MainTest() {
        super(MainActivity.class);
    }

    protected void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
    }

    // Test that message for correct palindrome is shown in next activity
    public void testCorrectPalindromeMessage() {
        String message = "AManAPlanACanalPanama";
        sendMessage(message);
        Assert.assertTrue(solo.searchText("The word " + message + " is a palindrome"));
    }

    // Test that message for incorrect palindrome is shown in next activity
    public void testNoPalindromeMessage() {
        String message = "Android";
        sendMessage(message);
        Assert.assertTrue(solo.searchText("The word " + message + " is not a palindrome"));
    }

    protected void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }

    private void sendMessage(String message) {
        EditText wordField = (EditText) solo.getView(R.id.edit_message);
        solo.clearEditText(wordField);
        solo.enterText(wordField, message);
        Button sendBtn = (Button) solo.getView(R.id.send_message);
        solo.clickOnButton((String)sendBtn.getText());
    }
}
