package hxchen.sg.edu.ntu.a05switchscreens;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onGetNameClick(View view) {
        Intent intent = new Intent(this, SecondScreen.class);
        final int result = 1;
        intent.putExtra("callingActivity", "MainAAA");
        intent.putExtra("human", new Human("hongxu", "chen", 26));
        startActivityForResult(intent, result);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView userNameMsg = (TextView) findViewById(R.id.users_name_msg);
        String nameSentBack = data.getStringExtra("userName");
        assert userNameMsg != null;
        userNameMsg.append(" " + nameSentBack);
    }
}
