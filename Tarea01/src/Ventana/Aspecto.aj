package Ventana;

import javax.swing.JFrame;

public aspect Aspecto{
	

	
	pointcut cambio(): execution(void *actionPerformed*(..) );
	after(): cambio(){
		String metodo= thisJoinPoint.getSignature().toString();
		if(metodo.contains("1")) {
			System.out.println("Se cambió de fondo a rojo");
			
		}
		if(metodo.contains("2")) {
			System.out.println("Se cambió de fondo a verde");
		}
		if(metodo.contains("3")) {
			System.out.println("Se cambió de fondo a azul");
		}
		
		

	}
	
	

	
	
}
