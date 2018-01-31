package a05_Prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * 若要使用clone方法必须要实现Clonneable接口,以达到标记的作用，不然会报CloneNotSupportedException	
 */
public class Sheep implements Cloneable,Serializable{
	private String name;
	private ArrayList<String> stuff;

	public Sheep(String name, ArrayList<String> stuff) {
		super();
		this.name = name;
		this.stuff = stuff;
	}
	
	public Sheep(){
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public Sheep clone(){
		Sheep obj = null;
		try {
			obj = (Sheep) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
	
	//深度复制
	public Sheep deepClone(){
		Sheep obj = null;
		try {
			obj = (Sheep) super.clone();
			obj.stuff = (ArrayList<String>) this.stuff.clone(); //深度复制
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
	
	//通过序列化克隆
	public Sheep cloneBySerial(){
		Sheep obj = null;
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream    oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			byte[] bytes = bos.toByteArray();
			
			ByteArrayInputStream  bis = new ByteArrayInputStream(bytes);
			ObjectInputStream	  ois = new ObjectInputStream(bis);
			
			obj = (Sheep) ois.readObject();   //克隆好的对象！
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getStuff() {
		return stuff;
	}

	public void setStuff(ArrayList<String> stuff) {
		this.stuff = stuff;
	}


}
