package alibaba.man_yunos_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.sdk.yunos.man.MANService;
import com.alibaba.sdk.yunos.man.MANServiceProvider;

import java.util.HashMap;
import java.util.Map;

public class TestPageHitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_page_hit);

        // 页面增加属性统计，见文档4.2.2
        Map<String, String> lMap = new HashMap<String, String>();
        lMap.put("item_id", "xxxxxx");
        MANService manService = MANServiceProvider.getService();
        manService.getMANPageHitHelper().updatePageProperties(lMap);
    }
}
