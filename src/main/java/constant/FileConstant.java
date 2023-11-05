package constant;

import utilis.CommonUtilis;

public class FileConstant {
	public static final String FOLDER_PATH =  System.getProperty("user.dir") + "/src/main/resources/properties";
	public static final String REPORT_PATH =  System.getProperty("user.dir") + "/src/main/resources/reports/"+CommonUtilis.getDateAndTimeStamp()+"app.html";
	public static final String SCREENSHOT_FOLDER_PATH =  System.getProperty("user.dir") + "/src/main/resources/reports/"+CommonUtilis.getDateAndTimeStamp()+"app.PNG";
	

}
