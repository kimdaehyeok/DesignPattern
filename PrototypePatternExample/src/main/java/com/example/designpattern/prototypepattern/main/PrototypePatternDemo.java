package com.example.designpattern.prototypepattern.main;

import java.util.Hashtable;

import com.example.designpattern.prototypepattern.abstracts.Shape;
import com.example.designpattern.prototypepattern.cache.ShapeCache;

/* object 생성이 높은 비용으로 수 많은 요청을 하는 경우, 비슷한 object를 지속적으로 생성해야 할 때 사용
 * new 를 사용하여 객체를 생성 하는것이 비용이 크거나 , 기존의 객체와 비슷하지만 일부만 변경된 객체를 사용하는 경우 사용할 수 있다.
 * 혹은 데이터베이스에서 유사한 데이터를 계속 조회할경우 사용할 수 있다.
 * */
public class PrototypePatternDemo 
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		ShapeCache.loadCache();
		
		Shape clonedShape = ShapeCache.getShape("1"); 
		System.out.println("Shape : " + clonedShape.getType());

		Shape clonedShape2 = ShapeCache.getShape("2"); 
		System.out.println("Shape : " + clonedShape2.getType());
		
		Shape clonedShape3 = ShapeCache.getShape("3"); 
		System.out.println("Shape : " + clonedShape3.getType());
	}
}
