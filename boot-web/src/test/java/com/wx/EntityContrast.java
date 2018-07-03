package com.wx;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class EntityContrast{

    public <T> String contrast(T oldEntity, T newEntity){
    	if(!oldEntity.getClass().getTypeName().equals(newEntity.getClass().getTypeName())){
    		return "";
    	}
        Field[] fields = oldEntity.getClass().getDeclaredFields();
        StringBuilder sb = new StringBuilder("");
        try {
        	for (Field field : fields) {
				Contrast annotation = field.getAnnotation(Contrast.class);
				if(null != annotation){
					System.out.println(annotation.getString());
				}
				if(null == annotation || annotation.value()){
					PropertyDescriptor pd = new PropertyDescriptor(field.getName(), oldEntity.getClass());
					Method getMethod = pd.getReadMethod();
					Object o1 = getMethod.invoke(oldEntity);
					Object o2 = getMethod.invoke(newEntity);
					if(null != o1 && null != o2){
						if(!o1.toString().equals(o2.toString())){
							sb.append(field.getName()+"-变更前:"+o1.toString()+" 变更后:"+o2.toString());
						}
					}else if(null != o1 || null != o2){
						sb.append(field.getName()+"-变更前:"+o1.toString()+" 变更后:"+o2.toString());
					}
					sb.append(" ");
				}
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
        System.out.println(sb.toString());
        return sb.toString();
    }
    
    public static void main(String[] args) {
    	EntityContrast ec = new EntityContrast();
    	ec.contrast(new TT("1", "wx", "12"), new TT("2", "wx", "13"));
	}
}