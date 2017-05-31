package util;

import constants.Constants;

public class StringUtils {

	public static String[] getErrorMessage(String iMessage) {
		System.out.println(iMessage);
		String[] sArray = new String[2];

		try {
			if(iMessage!=null && iMessage.startsWith(Constants.VALIDATION_ERROR)){
				int startPos = iMessage.indexOf("[");
				String newMessage = iMessage.substring(startPos);
				int endPos = (newMessage).indexOf("]");
				sArray[0] = "400";
				sArray[1] = newMessage.substring(1, endPos);
			}
			else if (iMessage!=null && iMessage.startsWith("Valida")) {
				int startPos = iMessage.indexOf("codes [");
				String newMessage = iMessage.substring(startPos);
				int endPos = (newMessage).indexOf(".");
				sArray[0] = "400";
				sArray[1] = newMessage.substring(7, endPos);
			} else {
				sArray[0] = "400";
				sArray[1] = "Unable to process request";
			}

		} catch (Exception e) {
			e.printStackTrace();
			sArray[0] = "500";
			sArray[1] = "Internal Server Error";
		}
		return sArray;
	}

}
