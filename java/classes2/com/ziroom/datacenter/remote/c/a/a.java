package com.ziroom.datacenter.remote.c.a;

import com.alibaba.fastjson.e;
import com.ziroom.commonlib.utils.g;

public class a
  extends f
{
  private final String b = "BiweeklyCleanHandler";
  
  public void decode(String paramString)
  {
    super.decode(g.desDecrypt(paramString));
  }
  
  public int getCode()
  {
    return 0;
  }
  
  public String getData()
  {
    if (this.a != null) {
      return this.a.getString("data");
    }
    return null;
  }
  
  public String getMessage()
  {
    if (this.a != null) {
      return this.a.getString("message");
    }
    return null;
  }
  
  public boolean isSuccess()
  {
    if (this.a != null) {
      return "0".equals(this.a.getString("status"));
    }
    return false;
  }
}


/* Location:              /Users/gaoht/Downloads/zirom/classes2-dex2jar.jar!/com/ziroom/datacenter/remote/c/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */