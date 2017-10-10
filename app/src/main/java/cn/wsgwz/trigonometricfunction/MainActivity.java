package cn.wsgwz.trigonometricfunction;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    private TrigonometricFunctionDemoView trigonometricFunctionDemoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
      /*  TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(stringFromJNI());*/
        trigonometricFunctionDemoView = (TrigonometricFunctionDemoView) findViewById(R.id.trigonometricFunctionDemoView);

        String url = "mqqwpa://im/chat?chat_type=crm&uin=800032752&version=1&src_type=web&web_src=http:://wpa.b.qq.com";
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
