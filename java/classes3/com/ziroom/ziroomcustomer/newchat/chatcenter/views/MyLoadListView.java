package com.ziroom.ziroomcustomer.newchat.chatcenter.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;

public class MyLoadListView
  extends LoadListView
{
  public MyLoadListView(Context paramContext)
  {
    super(paramContext);
  }
  
  public MyLoadListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public MyLoadListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
  }
}


/* Location:              /Users/gaoht/Downloads/zirom/classes3-dex2jar.jar!/com/ziroom/ziroomcustomer/newchat/chatcenter/views/MyLoadListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */