package com.alipay.e.a;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  public static String a(Context paramContext, Map<String, String> paramMap)
  {
    try
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("utdid", com.alipay.c.a.a.a.a.a(paramMap, "utdid", ""));
      localHashMap.put("tid", com.alipay.c.a.a.a.a.a(paramMap, "tid", ""));
      localHashMap.put("userId", com.alipay.c.a.a.a.a.a(paramMap, "userId", ""));
      com.alipay.b.g.a.a(paramContext).a(localHashMap);
      paramContext = com.alipay.b.a.a.a(paramContext);
      return paramContext;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
}


/* Location:              /Users/gaoht/Downloads/zirom/classes-dex2jar.jar!/com/alipay/e/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */