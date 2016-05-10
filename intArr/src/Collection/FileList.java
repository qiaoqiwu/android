package Collection;
import java.io.File;

public class FileList {
	public static void main(String[] args) {
		String str = "D:/pushwin";
		File f = new File(str);
		System.out.println(f.getName());
		tree(f,1);
	}
	
	private static void tree(File f, int level) {
		String preStr = "";
		for(int i=0;i<level;i++) {
			preStr += "    ";
		}
		
		File[] childs = f.listFiles();
		for(int i=0;i<childs.length;i++) {
			System.out.println(preStr + childs[i].getName());
			if(childs[i].isDirectory()) {
				tree(childs[i],level ++);
			}
		}
	}
}
