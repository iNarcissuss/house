package com.alibaba.fastjson.serializer;

public abstract interface ContextValueFilter
  extends SerializeFilter
{
  public abstract Object process(BeanContext paramBeanContext, Object paramObject1, String paramString, Object paramObject2);
}


/* Location:              /Users/gaoht/Downloads/zirom/classes-dex2jar.jar!/com/alibaba/fastjson/serializer/ContextValueFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */