package hxchen.sg.edu.ntu.a05switchscreens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondScreen extends Activity {
    public static final String TAG = SecondScreen.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "-- oncreat " + TAG);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Intent activityThatCalled = getIntent();
        String previousActivity = activityThatCalled.getExtras().getString("callingActivity");

        TextView textView = (TextView) findViewById(R.id.calling_info_textview);
        textView.setText(" " + previousActivity);
    }

    public void onSendUserName(View view) {
        EditText userNameET = (EditText) findViewById(R.id.users_name_edittext);
        String userName = String.valueOf(userNameET.getText());
        Intent goingBack = new Intent();
        goingBack.putExtra("userName", userName);
        setResult(RESULT_OK, goingBack);
        finish();
    }
}
