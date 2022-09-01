package Selenium_Automation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization{

	public static void getData() throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("D:\\Velocity Testing\\Subodh Sir\\Selenium\\Test.xlsx");

		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(value);

	}

	public static void getNumericData()
			throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("D:\\Velocity Testing\\Subodh Sir\\Selenium\\Test.xlsx");

		double value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();


		System.out.println(value);
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	//	Parameterization.getData();
	//	Parameterization.getNumericData();
	
	}

}
