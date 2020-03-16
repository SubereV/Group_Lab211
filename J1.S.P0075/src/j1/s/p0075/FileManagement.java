package j1.s.p0075;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;

public class FileManagement {
	public boolean checkExistPath(String path) {
		File f = new File(path);
		return f.exists();
	}

	public boolean checkFilePath(String path) {
		File f = new File(path);
		return f.isFile();
	}

	public boolean checkDirectoryPath(String path) {
		File f = new File(path);
		return f.isDirectory();
	}

	public void listJavaFile(String path) {
		File f = new File(path);
		File[] javaFiles = f.listFiles(new javaFileNameFilter());
		System.out.println("All of the files .java in directory " + f.getName() + " are:");
		for (File javaFile : javaFiles) {
			System.out.println(javaFile.getName());
		}
	}

	public void listSizeFile(String path, int n) {
		File f = new File(path);
		File[] sizeFiles = f.listFiles(new sizeFileFilter(n));
		System.out.println("All of the files have size greater than " + n + "kb in directory " + f.getName() + " are:");
		for (File sizeFile : sizeFiles) {
			System.out.println(sizeFile.getName() + " - " + sizeFile.length()+" byte");
		}
	}

	public void insertContent(String path, String content) {
		File f = new File(path);
		if (!f.canWrite()) {
			System.err.println("File " + f.getName() + " can't be written!");
			return;
		}
		try {
			FileWriter fw = new FileWriter(f, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
			fw.close();
			System.out.println("Insert content successfully!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Insert content failure!");
		}
	}

	public void countWords(String path) {
		File f = new File(path);
		if (!f.canRead()) {
			System.err.println("File " + f.getName() + " can't be read!");
			return;
		}
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String content = "";
			int i; 
			while((i=br.read())!=-1) {
				content+=(char)i; 
			}
			String[] wordsList = content.split("\\s");
			System.out.println("Number of words in the file " + f.getName() + " are: " + wordsList.length);
			br.close();
			fr.close();
		} catch (Exception e) {
			System.out.println("Read file failure!");
		}

	}

	public static class javaFileNameFilter implements FilenameFilter {
		@Override
		public boolean accept(File dir, String name) {
			// TODO Auto-generated method stub
			if (name.endsWith(".java")) {
				return true;
			}
			return false;
		}
	}

	public static class sizeFileFilter implements FileFilter {
		int n;

		public sizeFileFilter(int n) {
			this.n = n;
		}

		@Override
		public boolean accept(File pathname) {
			// TODO Auto-generated method stub
			if (pathname.isFile() && pathname.length() > n * 1024) {
				return true;
			}
			return false;
		}

	}
}
