package com.ft.ever.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.ft.ever.R;
import com.ft.ever.ui.base.FTActivity;
import com.widget.xlvfresh.XListView;

public class FindCarActivity extends FTActivity{
	
	private XListView mListView;
	ItemAdapter mAdapter;
	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.activity_findcar);
		mListView=(XListView) findViewById(R.id.listView);
		mAdapter=new ItemAdapter(this);
		mListView.setAdapter(mAdapter);
	}
	
	public class ItemAdapter extends ArrayAdapter<ProductItem> {

		public ItemAdapter(Context context){
			super(context,0);
		}
		
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return super.getCount();
		}
		
		public ItemAdapter(Context context, int resource) {
			super(context, resource);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			return super.getView(position, convertView, parent);
		}
	}
	
	class ProductItem{
		
	}
}
