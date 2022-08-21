public class ExtractExcelValues {
    public void Test(){
        public void HandleFeatures(String sheetname, int row) throws InterruptedException, IOException, InvalidFormatException {
            String email,password;
            List<Map<String, String>> testdata = reader.getData("src/main/resources/information.xlsx", sheetname);
            email = testdata.get(row).get("email");
            password = testdata.get(row).get("password");
    }
    
}
