package alibaba.man_yunos_demo;

import android.app.Activity;
import android.os.Bundle;

import com.alibaba.sdk.yunos.man.MANService;
import com.alibaba.sdk.yunos.man.MANServiceProvider;

/**
 * Created by LK on 16/1/30.
 * 手动页面埋点Activity基类，见文档4.2.1
 */
public class BaseActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();
        MANService manService = MANServiceProvider.getService();
        manService.getMANPageHitHelper().pageAppear(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        MANService manService = MANServiceProvider.getService();
        manService.getMANPageHitHelper().pageDisAppear(this);
    }
}
