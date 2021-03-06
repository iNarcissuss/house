package android.support.v4.os;

import java.util.Locale;

abstract interface LocaleListInterface
{
  public abstract boolean equals(Object paramObject);
  
  public abstract Locale get(int paramInt);
  
  public abstract Locale getFirstMatch(String[] paramArrayOfString);
  
  public abstract Object getLocaleList();
  
  public abstract int hashCode();
  
  public abstract int indexOf(Locale paramLocale);
  
  public abstract boolean isEmpty();
  
  public abstract void setLocaleList(Locale... paramVarArgs);
  
  public abstract int size();
  
  public abstract String toLanguageTags();
  
  public abstract String toString();
}


/* Location:              /Users/gaoht/Downloads/zirom/classes-dex2jar.jar!/android/support/v4/os/LocaleListInterface.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */