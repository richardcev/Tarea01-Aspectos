package Ventana;

public aspect Aspecto{
	int clicksRojos=0;
	int clicksVerdes=0;
	int clicksAzules=0;
	

	
	pointcut cambio(): execution(void *actionPerformed*(..) );
	after(): cambio(){
		String metodo= thisJoinPoint.getSignature().toString();
		if(metodo.contains("1")) {
			System.out.println("Se cambió de fondo a rojo");
			clicksRojos++;
			
		}
		if(metodo.contains("2")) {
			System.out.println("Se cambió de fondo a verde");
			clicksVerdes++;
		}
		if(metodo.contains("3")) {
			System.out.println("Se cambió de fondo a azul");
			clicksAzules++;
		}
		if(metodo.contains("4")) {
			System.out.println("Actividad del usuario");
			System.out.println(clicksRojos+" clicks rojos ");
			System.out.println(clicksVerdes+" clicks verdes");
			System.out.println(clicksAzules+" clicks azules");
		}
		
		
		
		

	}
	
	

	
	
}
