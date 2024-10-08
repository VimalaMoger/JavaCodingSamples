package java5.enumExamples;

import java.util.Base64;

public class ApplicationLayer {
	
		public static void main(String[] args) {
		
			for (EnumBasics e : EnumBasics.values()) {
				System.out.println(e.getDescription());
			}

			Application app= new Application();
			String s =app.applyOperation(ExtendingEnum.BASE64_ENCODE, " hello");
			System.out.println("encoded input in "+s);
			s = app.applyOperation(ExtendingEnum.MD5_ENCODE, " hello");
			System.out.println("md5Hex in "+s);
			s =app.applyOperation(ExtendingEnum.BASE64_MIME,  " hello");
			System.out.println("Mime encoder in "+s);
			
			s =app.applyOperation(ExtendingEnum.BASE64_MIMEDECODE, s);
			System.out.println("Mime decoder in "+s);
			
			String originalInput = "model.test input";
			String encodedString = new String(Base64.getMimeEncoder().encode(originalInput.getBytes()));
			String decodedString = new String(Base64.getMimeDecoder().decode(encodedString.getBytes()));
			System.out.println("*****************************************");
			System.out.println("orginal string: "+originalInput);
			System.out.println(encodedString);
			System.out.println(decodedString);
			
		}
		
	
	

}
