package com.baidu.mapapi.utils;

import com.baidu.mapapi.model.LatLng;

public class AreaUtil
{
  public static double calculateArea(LatLng paramLatLng1, LatLng paramLatLng2)
  {
    if ((paramLatLng1 == null) || (paramLatLng2 == null)) {}
    double d1;
    double d2;
    do
    {
      return 0.0D;
      LatLng localLatLng = new LatLng(paramLatLng1.latitude, paramLatLng2.longitude);
      d1 = DistanceUtil.getDistance(localLatLng, paramLatLng2);
      d2 = DistanceUtil.getDistance(paramLatLng1, localLatLng);
    } while ((d1 == 0.0D) || (d2 == 0.0D));
    return d1 * d2;
  }
}


/* Location:              /Users/gaoht/Downloads/zirom/classes-dex2jar.jar!/com/baidu/mapapi/utils/AreaUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */