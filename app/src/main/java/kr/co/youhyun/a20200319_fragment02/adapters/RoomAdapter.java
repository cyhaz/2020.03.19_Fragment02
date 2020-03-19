package kr.co.youhyun.a20200319_fragment02.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

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
//    => 화면에 나타나야하는 줄을 그릴때마다 실행됨 (스크롤시에도 영항)
//    목록 : 1~9 일때, 0번 그릴 때 실행, 1번 그릴 때 실행... => 실행될때마다 몇번줄을 그리러 오는건지 posiion에 담겨있음
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Log.d("getView 실행", position+"번 줄");

        View row = convertView;    //  한 줄이라는 의미를  강화 : 변수 이름 변경

//        row : 한 줄이 없다? => 새로  XML => JAVA로 그려줘야한다. (inflate)
//        리스트뷰의 재활용성(이론)에서 다시 설명
        if (row == null) {
            Log.d("row==null인상황",position+"번 줄");
            row = inflater.inflate(R.layout.room_list_item,null);

        }

//        뷰를 새로 그리건 / 돌려막던 내용은 항상 반영해줘야한다.
//        재사용 if문 밖에서 내용 반영 코드 작성

//        반영 근거 데이터 변수를 mList에서 가져오자 =>position을 이용해서 가져옴
        Room room = mList.get(position);

//        XML에 데이터 반영 (JAVA에서 XML에 반영 -> findViewById로 연결
//        recylerView => 데이터바인딩처럼 활용 기능 제공
//        ListView => 직접 findViewById로 연결

//        이번에 그리려는 줄 안에서 뷰를 찾자
//        row(그리는줄).findViewById
        TextView priceTxt = row.findViewById(R.id.priceTxt);
        TextView addressTxt = row.findViewById(R.id.addressTxt);

//        상황별 데이터 반영
        addressTxt.setText(room.getAddress());
        priceTxt.setText(String.format("%,d만원", room.getPrice()));


//        반영이 끝난 row를 화면에 뿌리도록 결과로 지적
        return row;    // row변수에 담긴 XML을 홤화면에 뿌지라! 결과로 선정

    }
}
