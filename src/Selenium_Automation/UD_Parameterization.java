package Selenium_Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UD_Parameterization {

	public static String getData(String sheetname, int row, int cell) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("D:\\Velocity Testing\\Subodh Sir\\Selenium\\Test.xlsx");

		String value = WorkbookFactory.create(file).getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();

		return value;

	}

	public static double getNumericData(String sheetname, int row, int cell)
			throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("D:\\Velocity Testing\\Subodh Sir\\Selenium\\Test.xlsx");

		double value = WorkbookFactory.create(file).getSheet(sheetname).getRow(row).getCell(cell).getNumericCellValue();

		return value;

	}
}