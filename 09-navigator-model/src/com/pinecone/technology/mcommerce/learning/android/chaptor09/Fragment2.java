package com.pinecone.technology.mcommerce.learning.android.chaptor09;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment2 extends Fragment
{
	@Override
	public View onCreateView( LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState )
	{
		return inflater.inflate( R.layout.frag2, container, false );
	}
}
