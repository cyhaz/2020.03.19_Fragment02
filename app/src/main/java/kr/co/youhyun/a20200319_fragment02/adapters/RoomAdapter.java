package kr.co.youhyun.a20200319_fragment02.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import kr.co.youhyun.a20200319_fragment02.R;
import kr.co.youhyun.a20200319_fragment02.datas.Room;

public class RoomAdapter extends ArrayAdapter<Room> {

    Context mcontext;   // 어느 화면에서 어댑터를 쓰는지 보관
    List<Room> mList;   // (액티비티에서 보내주는) 방 목록 배열을 보관하는 변수
    LayoutInflater inflater;    // xml => 객체화하는 담당 클래스

    public RoomAdapter(@NonNull Context context, int resource, @NonNull List<Room> objects) {
        super(context, resource, objects);

        mcontext = context;
        mList = objects;
        inflater = LayoutInflater.from(mcontext);

    }

//    getView : 각각의 줄을 그려주는 메쏘드
//    목록 : 1~9 일때, 0번 그릴 때 실행, 1번 그릴 때 실행... => 실행될때마다 몇번줄을 그리러 오는건지 posiion에 담겨있음
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View row = convertView;    //  한 줄이라는 의미를  강화 : 변수 이름 변경

//        row : 한 줄이 없다? => 새로  XML => JAVA로 그려줘야한다. (inflate)
//        리스트뷰의 재활용성(이론)에서 다시 설명
        if (roww == null) {
            row = inflater.inflate(R.layout.room_list_item,null);

        }

        return row;    // row변수에 담긴 XML을 홤화면에 뿌지라! 결과도 선선ㅇ

    }
}
