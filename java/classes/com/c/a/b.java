package com.c.a;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

class b
  implements Closeable
{
  private final InputStream a;
  private final Charset b;
  private byte[] c;
  private int d;
  private int e;
  
  public b(InputStream paramInputStream, int paramInt, Charset paramCharset)
  {
    if ((paramInputStream == null) || (paramCharset == null)) {
      throw new NullPointerException();
    }
    if (paramInt < 0) {
      throw new IllegalArgumentException("capacity <= 0");
    }
    if (!paramCharset.equals(c.a)) {
      throw new IllegalArgumentException("Unsupported encoding");
    }
    this.a = paramInputStream;
    this.b = paramCharset;
    this.c = new byte[paramInt];
  }
  
  public b(InputStream paramInputStream, Charset paramCharset)
  {
    this(paramInputStream, 8192, paramCharset);
  }
  
  private void a()
    throws IOException
  {
    int i = this.a.read(this.c, 0, this.c.length);
    if (i == -1) {
      throw new EOFException();
    }
    this.d = 0;
    this.e = i;
  }
  
  public void close()
    throws IOException
  {
    synchronized (this.a)
    {
      if (this.c != null)
      {
        this.c = null;
        this.a.close();
      }
      return;
    }
  }
  
  public String readLine()
    throws IOException
  {
    synchronized (this.a)
    {
      if (this.c == null) {
        throw new IOException("LineReader is closed");
      }
    }
    if (this.d >= this.e) {
      a();
    }
    int i = this.d;
    for (;;)
    {
      if (i != this.e)
      {
        if (this.c[i] != 10) {
          break label272;
        }
        if ((i == this.d) || (this.c[(i - 1)] != 13)) {
          break label267;
        }
      }
      label267:
      for (int j = i - 1;; j = i)
      {
        Object localObject2 = new String(this.c, this.d, j - this.d, this.b.name());
        this.d = (i + 1);
        return (String)localObject2;
        localObject2 = new ByteArrayOutputStream(this.e - this.d + 80)
        {
          public String toString()
          {
            if ((this.count > 0) && (this.buf[(this.count - 1)] == 13)) {}
            for (int i = this.count - 1;; i = this.count) {
              try
              {
                String str = new String(this.buf, 0, i, b.a(b.this).name());
                return str;
              }
              catch (UnsupportedEncodingException localUnsupportedEncodingException)
              {
                throw new AssertionError(localUnsupportedEncodingException);
              }
            }
          }
        };
        for (;;)
        {
          ((ByteArrayOutputStream)localObject2).write(this.c, this.d, this.e - this.d);
          this.e = -1;
          a();
          i = this.d;
          while (i != this.e)
          {
            if (this.c[i] == 10)
            {
              if (i != this.d) {
                ((ByteArrayOutputStream)localObject2).write(this.c, this.d, i - this.d);
              }
              this.d = (i + 1);
              localObject2 = ((ByteArrayOutputStream)localObject2).toString();
              return (String)localObject2;
            }
            i += 1;
          }
        }
      }
      label272:
      i += 1;
    }
  }
}


/* Location:              /Users/gaoht/Downloads/zirom/classes-dex2jar.jar!/com/c/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */