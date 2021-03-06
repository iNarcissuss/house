package org.ksoap2.transport;

import com.maa.android.agent.instrumentation.Instrumented;
import com.mato.sdk.instrumentation.HttpInstrumentation;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.ksoap2.HeaderProperty;

@Instrumented
public class ServiceConnectionSE
  implements ServiceConnection
{
  private HttpURLConnection connection;
  
  public ServiceConnectionSE(String paramString)
    throws IOException
  {
    this(null, paramString, 20000);
  }
  
  public ServiceConnectionSE(String paramString, int paramInt)
    throws IOException
  {
    this(null, paramString, paramInt);
  }
  
  public ServiceConnectionSE(Proxy paramProxy, String paramString)
    throws IOException
  {
    this(paramProxy, paramString, 20000);
  }
  
  public ServiceConnectionSE(Proxy paramProxy, String paramString, int paramInt)
    throws IOException
  {
    if (paramProxy == null)
    {
      paramProxy = new URL(paramString);
      if (!(paramProxy instanceof URL)) {
        paramProxy = paramProxy.openConnection();
      }
    }
    for (paramProxy = (HttpURLConnection)paramProxy;; paramProxy = (HttpURLConnection)new URL(paramString).openConnection(paramProxy))
    {
      this.connection = paramProxy;
      this.connection.setUseCaches(false);
      this.connection.setDoOutput(true);
      this.connection.setDoInput(true);
      this.connection.setConnectTimeout(paramInt);
      this.connection.setReadTimeout(paramInt);
      return;
      paramProxy = HttpInstrumentation.openConnection((URL)paramProxy);
      break;
    }
  }
  
  public void connect()
    throws IOException
  {
    this.connection.connect();
  }
  
  public void disconnect()
  {
    this.connection.disconnect();
  }
  
  public InputStream getErrorStream()
  {
    return this.connection.getErrorStream();
  }
  
  public String getHost()
  {
    return this.connection.getURL().getHost();
  }
  
  public String getPath()
  {
    return this.connection.getURL().getPath();
  }
  
  public int getPort()
  {
    return this.connection.getURL().getPort();
  }
  
  public int getResponseCode()
    throws IOException
  {
    return this.connection.getResponseCode();
  }
  
  public List getResponseProperties()
    throws IOException
  {
    LinkedList localLinkedList = new LinkedList();
    Map localMap = this.connection.getHeaderFields();
    if (localMap != null)
    {
      Iterator localIterator = localMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        List localList = (List)localMap.get(str);
        int i = 0;
        while (i < localList.size())
        {
          localLinkedList.add(new HeaderProperty(str, (String)localList.get(i)));
          i += 1;
        }
      }
    }
    return localLinkedList;
  }
  
  public InputStream openInputStream()
    throws IOException
  {
    return this.connection.getInputStream();
  }
  
  public OutputStream openOutputStream()
    throws IOException
  {
    return this.connection.getOutputStream();
  }
  
  public void setFixedLengthStreamingMode(int paramInt)
  {
    this.connection.setFixedLengthStreamingMode(paramInt);
  }
  
  public void setRequestMethod(String paramString)
    throws IOException
  {
    this.connection.setRequestMethod(paramString);
  }
  
  public void setRequestProperty(String paramString1, String paramString2)
  {
    this.connection.setRequestProperty(paramString1, paramString2);
  }
}


/* Location:              /Users/gaoht/Downloads/zirom/classes4-dex2jar.jar!/org/ksoap2/transport/ServiceConnectionSE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */