package com.imsdk.imdeveloper.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import com.imsdk.imdeveloper.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Michael-huang on 2016/9/19.
 */
public class WorkFragment  extends Fragment {

    private GridView gview;
    private List<Map<String, Object>> data_list;
    private SimpleAdapter sim_adapter;
    // 图片封装为一个数组
    private int[] icon = { R.drawable.weight_btn_sign_normal, R.drawable.weight_btn_todo_normal,
            R.drawable.file_more_btn_cloud, R.drawable.notif_push_large_icon,
            R.drawable.inbox_btn_approval_normal, R.drawable.phone_btn_hf_down, R.drawable.inbox_btn_work_report_normal };
    private String[] iconName = { "签到", "任务", "云盘", "日志", "审批", "公告", "工作汇报"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_work, container, false);
        gview = (GridView) view.findViewById(R.id.workGridView);
        //新建List
        data_list = new ArrayList<Map<String, Object>>();
        //获取数据
        getData();
        //新建适配器
        String [] from ={"image","text"};
        int [] to = {R.id.image,R.id.text};
        sim_adapter = new SimpleAdapter(getActivity(), data_list, R.layout.work_item, from, to);
        //配置适配器
        gview.setAdapter(sim_adapter);
        return view;
    }



    public List<Map<String, Object>> getData(){
        //cion和iconName的长度是相同的，这里任选其一都可以
        for(int i=0;i<icon.length;i++){
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", icon[i]);
            map.put("text", iconName[i]);
            data_list.add(map);
        }

        return data_list;
    }
}
