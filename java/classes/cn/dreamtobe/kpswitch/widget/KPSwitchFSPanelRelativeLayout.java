package cn.dreamtobe.kpswitch.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Window;
import android.widget.RelativeLayout;
import cn.dreamtobe.kpswitch.a.a;
import cn.dreamtobe.kpswitch.b;
import cn.dreamtobe.kpswitch.b.e;

public class KPSwitchFSPanelRelativeLayout
  extends RelativeLayout
  implements b
{
  private a a;
  
  public KPSwitchFSPanelRelativeLayout(Context paramContext)
  {
    super(paramContext);
    a();
  }
  
  public KPSwitchFSPanelRelativeLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  public KPSwitchFSPanelRelativeLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  @TargetApi(21)
  public KPSwitchFSPanelRelativeLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    a();
  }
  
  private void a()
  {
    this.a = new a(this);
  }
  
  public void onKeyboardShowing(boolean paramBoolean)
  {
    this.a.onKeyboardShowing(paramBoolean);
  }
  
  public void recordKeyboardStatus(Window paramWindow)
  {
    this.a.recordKeyboardStatus(paramWindow);
  }
  
  public void refreshHeight(int paramInt)
  {
    e.refreshHeight(this, paramInt);
  }
}


/* Location:              /Users/gaoht/Downloads/zirom/classes-dex2jar.jar!/cn/dreamtobe/kpswitch/widget/KPSwitchFSPanelRelativeLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */