package sample1;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class dd {

	public static void main(String[] args) {
	FileInputStream file=new FileInputStream("C:\\Users\\91820\\Desktop\\12th march b selenium\\12th march b.xlsx");
		
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
	}
		
	} 
	

}
