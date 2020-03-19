package kr.co.youhyun.a20200319_fragment02.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import kr.co.youhyun.a20200319_fragment02.R;
import kr.co.youhyun.a20200319_fragment02.datas.ChickenStore;

public class ChickenStoreAdapter extends ArrayAdapter<ChickenStore> {

    Context mContext;
    List<ChickenStore> mList;
    LayoutInflater inflater;

    public ChickenStoreAdapter(@NonNull Context context, int resource, @NonNull List<ChickenStore> objects) {
        super(context, resource, objects);

        mContext = context;
        mList = objects;
        inflater = LayoutInflater.from(mContext);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View row = convertView;
        if (row == null) {
            row = inflater.inflate(R.layout.chickenstore_list_item, null);
        }

        ChickenStore chickenStore = mList.get(position);
        TextView chickenstoreNameTxt = row.findViewById(R.id.chickenstoreNameTxt);
        chickenstoreNameTxt.setText(chickenStore.getStoreName());

        return row;

    }
}
