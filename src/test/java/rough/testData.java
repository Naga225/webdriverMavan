package rough;

public class testData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ExcelReader excel= new ExcelReader("C:\\Testselenium\\HybridFramWrok\\testdata.xlsx");
		
		String sheetName="TestData";
		String testCase="SignupTest";
		
		int testCaseRowNum=1;
		while(!excel.getCellData(sheetName, 0, testCaseRowNum).equalsIgnoreCase(testCase)){
			
			
			testCaseRowNum++;
						
		}
         System.out.println("Test case stars from:"+testCaseRowNum);
         
         int colsStartRowNum=testCaseRowNum+1;
         int dataStartRowNum=colsStartRowNum+1;
         
         int cols=0;
         
         while(!excel.getCellData(sheetName, cols, colsStartRowNum).trim().equals("")){
        	 
        	 cols++;
         }
         System.out.println("total cols in a test:"+cols);
         
         int rows=0;
         
         while(!excel.getCellData(sheetName, 0, dataStartRowNum+rows).trim().equals("")){
        	 
        	 rows++;
         }
         System.out.println("total rows in a test:"+rows);
         
         
         for(int row=dataStartRowNum;row<dataStartRowNum+rows;row++ ){
        	 
        	 for(int col=0;col<cols;col++){
        		 
        		 System.out.println(excel.getCellData(sheetName, col, row));
        	 }
        	 
        	 
         }
         
         
         
	}

}
