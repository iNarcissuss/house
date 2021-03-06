package com.ziroom.ziroomcustomer.minsu.chat.d;

import android.annotation.SuppressLint;
import com.hyphenate.util.TimeInfo;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class i
{
  @SuppressLint({"SimpleDateFormat"})
  public static Date StringToDate(String paramString1, String paramString2)
  {
    paramString2 = new SimpleDateFormat(paramString2);
    try
    {
      paramString1 = paramString2.parse(paramString1);
      return paramString1;
    }
    catch (ParseException paramString1)
    {
      paramString1.printStackTrace();
    }
    return null;
  }
  
  private static boolean a(long paramLong)
  {
    TimeInfo localTimeInfo = getTodayStartAndEndTime();
    return (paramLong > localTimeInfo.getStartTime()) && (paramLong < localTimeInfo.getEndTime());
  }
  
  private static boolean b(long paramLong)
  {
    TimeInfo localTimeInfo = getYesterdayStartAndEndTime();
    return (paramLong > localTimeInfo.getStartTime()) && (paramLong < localTimeInfo.getEndTime());
  }
  
  public static TimeInfo getBeforeYesterdayStartAndEndTime()
  {
    Object localObject = Calendar.getInstance();
    ((Calendar)localObject).add(5, -2);
    ((Calendar)localObject).set(11, 0);
    ((Calendar)localObject).set(12, 0);
    ((Calendar)localObject).set(13, 0);
    ((Calendar)localObject).set(14, 0);
    long l1 = ((Calendar)localObject).getTime().getTime();
    localObject = Calendar.getInstance();
    ((Calendar)localObject).add(5, -2);
    ((Calendar)localObject).set(11, 23);
    ((Calendar)localObject).set(12, 59);
    ((Calendar)localObject).set(13, 59);
    ((Calendar)localObject).set(14, 999);
    long l2 = ((Calendar)localObject).getTime().getTime();
    localObject = new TimeInfo();
    ((TimeInfo)localObject).setStartTime(l1);
    ((TimeInfo)localObject).setEndTime(l2);
    return (TimeInfo)localObject;
  }
  
  public static TimeInfo getCurrentMonthStartAndEndTime()
  {
    Object localObject = Calendar.getInstance();
    ((Calendar)localObject).set(5, 1);
    ((Calendar)localObject).set(11, 0);
    ((Calendar)localObject).set(12, 0);
    ((Calendar)localObject).set(13, 0);
    ((Calendar)localObject).set(14, 0);
    long l1 = ((Calendar)localObject).getTime().getTime();
    long l2 = Calendar.getInstance().getTime().getTime();
    localObject = new TimeInfo();
    ((TimeInfo)localObject).setStartTime(l1);
    ((TimeInfo)localObject).setEndTime(l2);
    return (TimeInfo)localObject;
  }
  
  public static TimeInfo getLastMonthStartAndEndTime()
  {
    Object localObject = Calendar.getInstance();
    ((Calendar)localObject).add(2, -1);
    ((Calendar)localObject).set(5, 1);
    ((Calendar)localObject).set(11, 0);
    ((Calendar)localObject).set(12, 0);
    ((Calendar)localObject).set(13, 0);
    ((Calendar)localObject).set(14, 0);
    long l1 = ((Calendar)localObject).getTime().getTime();
    localObject = Calendar.getInstance();
    ((Calendar)localObject).add(2, -1);
    ((Calendar)localObject).set(5, 1);
    ((Calendar)localObject).set(11, 23);
    ((Calendar)localObject).set(12, 59);
    ((Calendar)localObject).set(13, 59);
    ((Calendar)localObject).set(14, 999);
    ((Calendar)localObject).roll(5, -1);
    long l2 = ((Calendar)localObject).getTime().getTime();
    localObject = new TimeInfo();
    ((TimeInfo)localObject).setStartTime(l1);
    ((TimeInfo)localObject).setEndTime(l2);
    return (TimeInfo)localObject;
  }
  
  public static String getTimestampStr()
  {
    return Long.toString(System.currentTimeMillis());
  }
  
  public static String getTimestampString(Date paramDate)
  {
    boolean bool = Locale.getDefault().getLanguage().startsWith("zh");
    long l = paramDate.getTime();
    String str;
    if (a(l)) {
      if (bool) {
        str = "HH:mm";
      }
    }
    while (bool)
    {
      return new SimpleDateFormat(str, Locale.CHINESE).format(paramDate);
      str = "HH:mm ";
      continue;
      if (b(l))
      {
        if (bool) {
          str = "昨天 HH:mm";
        } else {
          return "Yesterday " + new SimpleDateFormat("HH:mm ", Locale.ENGLISH).format(paramDate);
        }
      }
      else if (bool) {
        str = "M月d日 HH:mm";
      } else {
        str = "MMM dd HH:mm";
      }
    }
    return new SimpleDateFormat(str, Locale.ENGLISH).format(paramDate);
  }
  
  public static TimeInfo getTodayStartAndEndTime()
  {
    Object localObject = Calendar.getInstance();
    ((Calendar)localObject).set(11, 0);
    ((Calendar)localObject).set(12, 0);
    ((Calendar)localObject).set(13, 0);
    ((Calendar)localObject).set(14, 0);
    long l1 = ((Calendar)localObject).getTime().getTime();
    localObject = Calendar.getInstance();
    ((Calendar)localObject).set(11, 23);
    ((Calendar)localObject).set(12, 59);
    ((Calendar)localObject).set(13, 59);
    ((Calendar)localObject).set(14, 999);
    long l2 = ((Calendar)localObject).getTime().getTime();
    localObject = new TimeInfo();
    ((TimeInfo)localObject).setStartTime(l1);
    ((TimeInfo)localObject).setEndTime(l2);
    return (TimeInfo)localObject;
  }
  
  public static TimeInfo getYesterdayStartAndEndTime()
  {
    Object localObject = Calendar.getInstance();
    ((Calendar)localObject).add(5, -1);
    ((Calendar)localObject).set(11, 0);
    ((Calendar)localObject).set(12, 0);
    ((Calendar)localObject).set(13, 0);
    ((Calendar)localObject).set(14, 0);
    long l1 = ((Calendar)localObject).getTime().getTime();
    localObject = Calendar.getInstance();
    ((Calendar)localObject).add(5, -1);
    ((Calendar)localObject).set(11, 23);
    ((Calendar)localObject).set(12, 59);
    ((Calendar)localObject).set(13, 59);
    ((Calendar)localObject).set(14, 999);
    long l2 = ((Calendar)localObject).getTime().getTime();
    localObject = new TimeInfo();
    ((TimeInfo)localObject).setStartTime(l1);
    ((TimeInfo)localObject).setEndTime(l2);
    return (TimeInfo)localObject;
  }
  
  public static boolean isCloseEnough(long paramLong1, long paramLong2)
  {
    paramLong2 = paramLong1 - paramLong2;
    paramLong1 = paramLong2;
    if (paramLong2 < 0L) {
      paramLong1 = -paramLong2;
    }
    return paramLong1 < 30000L;
  }
  
  @SuppressLint({"DefaultLocale"})
  public static String toTime(int paramInt)
  {
    int j = paramInt / 1000;
    int i = j / 60;
    paramInt = i;
    if (i >= 60)
    {
      paramInt = i / 60;
      paramInt = i % 60;
    }
    return String.format("%02d:%02d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(j % 60) });
  }
  
  @SuppressLint({"DefaultLocale"})
  public static String toTimeBySecond(int paramInt)
  {
    int j = paramInt / 60;
    int i = j;
    if (j >= 60)
    {
      i = j / 60;
      i = j % 60;
    }
    return String.format("%02d:%02d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt % 60) });
  }
}


/* Location:              /Users/gaoht/Downloads/zirom/classes3-dex2jar.jar!/com/ziroom/ziroomcustomer/minsu/chat/d/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */