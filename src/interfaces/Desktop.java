package interfaces;

interface Hardware{  
 void hardwareResources();  
}  

interface Software{  
void softwareResources();  
}  


public  class Desktop implements Hardware,Software{  
	
public void  hardwareResources() {
	System.out.println("Printardware");
}

public void  softwareResources() {
	System.out.println("Print Software");
}


public static void main(String[] args) {
	Desktop De=new Desktop();
	De.hardwareResources();
	De.softwareResources();
				
	
}
}
