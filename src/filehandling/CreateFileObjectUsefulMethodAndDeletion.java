package filehandling;
import java.io.*;
public class CreateFileObjectUsefulMethodAndDeletion {

	public static void main(String[] args) throws IOException {
		File file = new File("abcd.txt");
		System.out.println("Exists:"+file.exists());
		System.out.println("Absolute Path:"+file.getAbsolutePath());
		System.out.println("isDirectory:"+file.isDirectory());
		System.out.println("isFile:"+file.isFile());
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("Exists:"+file.exists());
			file.delete();
			System.out.println("Exists:"+file.exists());
		}

	}

}
