package oopWithNLayeredApp.core.logging;

public class FileLogger implements Logger {
	@Override  // implemey ettiğimiz için abstrak gibi yerden geldiğini söyler
	public void log(String data) {
		System.out.println("Dosyaya loglandi :" + data);
		
	}

}
