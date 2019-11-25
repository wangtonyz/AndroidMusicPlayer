package com.hq.hqmusic.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.hq.hqmusic.Entity.Song;
import com.hq.hqmusic.UI.MainActivity;
import com.hq.hqmusic.R;
import com.hq.hqmusic.Utils.MusicUtils;

import java.util.List;

public class MyAdapter extends BaseAdapter {
	private Context context;
	private List<Song> list;
	private int position_flag = 0;


	private String Theme;

	public MyAdapter(MainActivity mainActivity, List<Song> list) {
		this.context = mainActivity;
		this.list = list;
	}

	public void setFlag(int flag) {
		this.position_flag = flag;
	}

	public void setTheme(String Theme) {
		this.Theme = Theme;
	}

	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Object getItem(int i) {
		return list.get(i);
	}

	@Override
	public long getItemId(int i) {
		return i;
	}

	@Override
	public View getView(int i, View view, ViewGroup viewGroup) {

		ViewHolder holder = null;
		if (view == null) {
			holder = new ViewHolder();
			// 引入布局
			view = View.inflate(context, R.layout.list_item, null);
			// 实例化对象
			holder.song = (TextView) view.findViewById(R.id.item_mymusic_song);
			holder.singer = (TextView) view
					.findViewById(R.id.item_mymusic_singer);
			holder.duration = (TextView) view
					.findViewById(R.id.item_mymusic_duration);
			holder.position = (TextView) view
					.findViewById(R.id.item_mymusic_postion);
			view.setTag(holder);
		} else {
			holder = (ViewHolder) view.getTag();
		}
		// 给控件赋值
		String string_song = list.get(i).getSong();
		if (string_song.length() >= 5
				&& string_song.substring(string_song.length() - 4,
						string_song.length()).equals(".mp3")) {
			holder.song.setText(string_song.substring(0,
					string_song.length() - 4).trim());
		} else {
			holder.song.setText(string_song.trim());
		}
		if (i == position_flag) {
			holder.position
					.setBackgroundResource(R.mipmap.play_small_red);
			holder.position.setText("");
		} else {
			holder.song.setTextColor(Color.BLACK);
			holder.singer.setTextColor(Color.BLACK);
			holder.duration.setTextColor(Color.BLACK);
			holder.position.setText(i + 1 + "");
			holder.position.setBackground(null);

		}

		holder.singer.setText(list.get(i).getSinger().toString().trim());
		// 时间需要转换一下
		int duration = list.get(i).getDuration();
		String time = MusicUtils.formatTime(duration);
		holder.duration.setText(time);

		return view;
	}

	class ViewHolder {
		TextView song;// 歌曲名
		TextView singer;// 歌手
		TextView duration;// 时长
		TextView position;// 序号
	}

}
