

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFiles {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("Test-Reports"+java.time.LocalDate.now()+".zip");
			ZipOutputStream zos = new ZipOutputStream(fos);

			String file1Name = "C:\\Users\\manoj\\eclipse-workspace-new\\MaventestProjectart\\test-output\\index.html";
			String file2Name = "C:\\Users\\manoj\\eclipse-workspace-new\\MaventestProjectart\\test-output\\bullet_point.png";
			//String file3Name = "C:\\Users\\manoj\\eclipse-workspace-new\\MaventestProjectart\\test-output\\collapseall.gif";
			String file4Name = "C:\\Users\\manoj\\eclipse-workspace-new\\MaventestProjectart\\test-output\\testng-reports.css";
			//String file5Name = "C:\\Users\\manoj\\eclipse-workspace-new\\MaventestProjectart\\test-output\\jquery-3.4.1.min.js";

			addToZipFile(file1Name, zos);
			addToZipFile(file2Name, zos);
			//addToZipFile(file3Name, zos);
			addToZipFile(file4Name, zos);
			//addToZipFile(file5Name, zos);

			zos.close();
			fos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void addToZipFile(String fileName, ZipOutputStream zos) throws FileNotFoundException, IOException {

		System.out.println("Writing '" + fileName + "' to zip file");

		File file = new File(fileName);
		FileInputStream fis = new FileInputStream(file);
		ZipEntry zipEntry = new ZipEntry(fileName);
		zos.putNextEntry(zipEntry);

		byte[] bytes = new byte[1024];
		int length;
		while ((length = fis.read(bytes)) >= 0) {
			zos.write(bytes, 0, length);
		}

		zos.closeEntry();
		fis.close();
	}

}