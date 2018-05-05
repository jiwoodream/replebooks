package president.lee.com.replebooks;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018-04-22.
 */


public class MyNote_adapter extends RecyclerView.Adapter<MyNote_adapter.ItemViewHolder> {
    ArrayList<RecyclerItem> mItems;

    public MyNote_adapter(ArrayList<RecyclerItem> items){
        mItems = items;
    }


    // 새로운 뷰 홀더 생성
    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mynote,parent,false);
        return new ItemViewHolder(view);
    }


    // View 의 내용을 해당 포지션의 데이터로 바꿉니다.
    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.mUserName.setText(mItems.get(position).getUserName());
        holder.mBookTitle.setText(mItems.get(position).getBookTitle());
    }

    // 데이터 셋의 크기를 리턴해줍니다.
    @Override
    public int getItemCount() {
        return mItems.size();
    }

    // 커스텀 뷰홀더
// item layout 에 존재하는 위젯들을 바인딩합니다.
    class ItemViewHolder extends RecyclerView.ViewHolder{
        private TextView mUserName;
        private TextView mBookTitle;
        public ItemViewHolder(View itemView) {
            super(itemView);
            mUserName = (TextView) itemView.findViewById(R.id.item_username);
            mBookTitle = (TextView) itemView.findViewById(R.id.item_booktitle);
        }
    }
}