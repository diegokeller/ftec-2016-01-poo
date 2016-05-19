package aula12.rede_social;

public class MainRedeSocial {

	public static void main(String[] args) {
		
		Compartilhavel c = new Facebook();
		c.compartilhar();

		Facebook f = new Facebook();
		f.compartilhar();
		
		Twitter t = new Twitter();
		VLC vlc = new VLC();
		
		// Vamos testar se "t" pode assumir a forma
		// de algo compartilhável.
		// Vamos testar se tem essa capacidade de compartilhar
		if (t instanceof Compartilhavel) {
			System.out.println("t É compartilhável");
			
			Compartilhavel t1 = (Compartilhavel) t;
			t1.compartilhar();
		}

		if (vlc instanceof Compartilhavel) {
			System.out.println("vlc É compartilhável");
		}
		
		
	}
	
}
