package IO;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class TestObjectIO {

	public static void main(String[] args) throws Exception {
		T t = new T();
		t.k = 8;
		FileOutputStream fos = new FileOutputStream("d:/testObjectIO.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(t);
		oos.flush();
		oos.close();
		
		FileInputStream fis = new FileInputStream("d:/testObjectIO.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		T tReaded = (T) ois.readObject();
		System.out.println(tReaded.i + " " + tReaded.j + " " + tReaded.d + " " + tReaded.k);
		ois.close();
	}

}
class T implements Serializable  {
	int i = 10;
	int j = 9;
	double d = 2.3;
	int k = 15;
}