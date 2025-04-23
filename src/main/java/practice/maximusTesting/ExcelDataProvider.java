package practice.maximusTesting;

import org.testng.annotations.DataProvider;
import practice.maximusTesting.utils.ExcelReader;

public class ExcelDataProvider {
	
    @DataProvider(name = "patientData")
    public static Object[][] getPatientData() throws Exception {
        ExcelReader read = new ExcelReader("C:\\Users\\ahmedh\\Desktop\\pt_data.xlsx");
        String sheetname = "pt_data";
        int rowCount = read.getRowCount(sheetname);
        
        Object[][] data = new Object[rowCount][6];  

        for (int i = 1; i <= rowCount; i++) {
            data[i - 1][0] = read.getCellData(sheetname, 0, i);  
            data[i - 1][1] = read.getCellData(sheetname, 1, i);  
            data[i - 1][2] = read.getCellData(sheetname, 2, i);  
            data[i - 1][3] = read.getCellData(sheetname, 3, i);  
            data[i - 1][4] = read.getCellData(sheetname, 4, i);  
            data[i - 1][5] = read.getCellData(sheetname, 5, i);  
        }

        return data;
    }
}
