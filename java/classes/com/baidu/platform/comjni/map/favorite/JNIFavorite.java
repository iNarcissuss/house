package com.baidu.platform.comjni.map.favorite;

import android.os.Bundle;

public class JNIFavorite
{
  public native boolean Add(long paramLong, String paramString1, String paramString2);
  
  public native boolean Clear(long paramLong);
  
  public native long Create();
  
  public native int GetAll(long paramLong, Bundle paramBundle);
  
  public native String GetValue(long paramLong, String paramString);
  
  public native boolean IsExist(long paramLong, String paramString);
  
  public native boolean Load(long paramLong, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3);
  
  public native int Release(long paramLong);
  
  public native boolean Remove(long paramLong, String paramString);
  
  public native boolean SaveCache(long paramLong);
  
  public native boolean SetType(long paramLong, int paramInt);
  
  public native boolean Update(long paramLong, String paramString1, String paramString2);
}


/* Location:              /Users/gaoht/Downloads/zirom/classes-dex2jar.jar!/com/baidu/platform/comjni/map/favorite/JNIFavorite.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */