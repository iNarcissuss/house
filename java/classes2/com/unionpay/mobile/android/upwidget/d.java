package com.unionpay.mobile.android.upwidget;

import android.view.View;
import android.view.View.OnClickListener;
import com.growingio.android.sdk.agent.VdsAgent;
import com.growingio.android.sdk.instrumentation.Instrumented;
import java.util.ArrayList;
import java.util.Iterator;

final class d
  implements View.OnClickListener
{
  d(c paramc) {}
  
  @Instrumented
  public final void onClick(View paramView)
  {
    VdsAgent.onClick(this, paramView);
    Iterator localIterator = c.a(this.a).iterator();
    while (localIterator.hasNext()) {
      ((View.OnClickListener)localIterator.next()).onClick(paramView);
    }
  }
}


/* Location:              /Users/gaoht/Downloads/zirom/classes2-dex2jar.jar!/com/unionpay/mobile/android/upwidget/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */