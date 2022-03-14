package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvGoods;
    CustomGoodsAdapter adt;
    ArrayList<Goods> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvGoods=findViewById(R.id.lvGoods);

        arrayList=new ArrayList<>();
        arrayList.add(new Goods("Ca nấu lẩu, nấu mì mini...","Shop Devang",
                R.drawable.ca_nau_lau));
        arrayList.add(new Goods("1KG KHÔ GÀ BƠ TỎI ...","Shop LTD Food",
                R.drawable.ga_bo_toi));
        arrayList.add(new Goods("Xe cần cẩu đa năng","Shop Thế giới đồ chơi",
                R.drawable.xa_can_cau));
        arrayList.add(new Goods("Đồ chơi dạng mô hình","Shop Thế giới đồ chơi",
                R.drawable.do_choi_dang_mo_hinh));
        arrayList.add(new Goods("Lãnh đạo đơn giản","Shop Minh Long Book",
                R.drawable.lanh_dao_gian_don));

        arrayList.add(new Goods("Hiểu lòng con trẻ","Shop Minh Long Book",
                R.drawable.hieu_long_con_tre));
        arrayList.add(new Goods("Donal Trump thiên tài lãnh đạo","Shop Devang",
                R.drawable.trump_1));
        adt=new CustomGoodsAdapter(this,R.layout.item_listview,arrayList);
        lvGoods.setAdapter(adt);
    }

}