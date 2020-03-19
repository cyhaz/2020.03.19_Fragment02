package kr.co.youhyun.a20200319_fragment02.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

import kr.co.youhyun.a20200319_fragment02.R;
import kr.co.youhyun.a20200319_fragment02.adapters.ChickenStoreAdapter;
import kr.co.youhyun.a20200319_fragment02.databinding.FragmentChickenStoreBinding;
import kr.co.youhyun.a20200319_fragment02.datas.ChickenStore;

public class ChickenStoreFragment extends Fragment {

    List<ChickenStore> chickenStoreList = new ArrayList<>();
    ChickenStoreAdapter adapter = null;
    FragmentChickenStoreBinding binding = null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_chicken_store, container, false);
        return  binding.getRoot();

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        adapter = new ChickenStoreAdapter(getActivity(), R.layout.chickenstore_list_item, chickenStoreList);
        binding.chickenListView.setAdapter(adapter);

        chickenStoreList.add(new ChickenStore("굽네치킨"));
        chickenStoreList.add(new ChickenStore("BBQ"));
        chickenStoreList.add(new ChickenStore("BHC"));
        chickenStoreList.add(new ChickenStore("네네치킨"));
        chickenStoreList.add(new ChickenStore("호식이치킨"));
        chickenStoreList.add(new ChickenStore("교촌치킨"));
        chickenStoreList.add(new ChickenStore("지코바"));
        chickenStoreList.add(new ChickenStore("KFC"));
        chickenStoreList.add(new ChickenStore("닭강정"));
        adapter.notifyDataSetChanged();




    }
}
