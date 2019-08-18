import java.io.File;

public class PackageCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File newFolder = new File("C:\\Users\\user\\Desktop\\JAVA\\New folder\\Workspace\\ZD\\src\\sample");
		
		boolean created =  newFolder.mkdir();
		
		if(created)
			System.out.println("Folder was created !");
		else
			System.out.println("Unable to create folder");
		
	}
	
	

}
