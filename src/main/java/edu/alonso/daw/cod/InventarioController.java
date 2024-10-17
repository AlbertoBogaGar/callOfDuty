package edu.alonso.daw.cod;

public class InventarioController {
	private final int TAM_INVENTARIO_DEF = 10;
	
	private Equipamiento[] armasPrincipalesInventario;
	private Equipamiento[] armasSecundariasInventario;
	private Equipamiento[] accesoriosInventario;
	
	
	public InventarioController() {
	
		
		this.armasPrincipalesInventario = new ArmaPrincipal[TAM_INVENTARIO_DEF];
		this.armasPrincipalesInventario[0] = new ArmaPrincipal("MP7", 5, 30);
		this.armasPrincipalesInventario[1] = new ArmaPrincipal("Vector K10", 7, 45);
		this.armasPrincipalesInventario[2] = new ArmaPrincipal("SCAR-H", 12, 50);
		this.armasPrincipalesInventario[3] = new ArmaPrincipal("KSG", 15, 60);
		this.armasPrincipalesInventario[4] = new ArmaPrincipal("G36K", 10, 40);
				

		// Arma Secundaria
		this.armasSecundariasInventario = new ArmaSecundaria[TAM_INVENTARIO_DEF];
		this.armasSecundariasInventario[0] = new ArmaSecundaria("Five-Seven", 2, "Semiautomática");
		this.armasSecundariasInventario[1] = new ArmaSecundaria("RPG", 10, "Lanzamisiles");
		this.armasSecundariasInventario[2] = new ArmaSecundaria("G17", 3, "Semiautomática");
		this.armasSecundariasInventario[3] = new ArmaSecundaria("Executioner", 4, "Revolver"); 
		this.armasSecundariasInventario[4] = new ArmaSecundaria("Crossbow", 5, "Ballesta");

		// Acesorio
		this.accesoriosInventario = new Accesorio[TAM_INVENTARIO_DEF];
		
		this.accesoriosInventario[0] = new Accesorio("Granada", 2, 200);
		this.accesoriosInventario[1] = new Accesorio("Cegadora", 1, 300);
		this.accesoriosInventario[2] = new Accesorio("Claymore", 5, 400); 
		this.accesoriosInventario[3] = new Accesorio("C4", 4, 500); 
		this.accesoriosInventario[4] = new Accesorio("Botiquín", 3, 600);
		
	}
	
	public void mostrarInventario() {
		
		mostrarArray(this.armasPrincipalesInventario, "Armas principales: \n------------------------\n");
		mostrarArray(this.armasSecundariasInventario, "Armas secundarias: \n------------------------\n");
		mostrarArray(this.accesoriosInventario, "Accesorios: \n------------------------\n");
	}
	
	private void mostrarArray(Equipamiento[] arr, String msg) {
		System.out.println(msg);
		for (Equipamiento item : arr) {
			if(item != null)
				System.out.println(item + "\n");
		}
	}
	
	

}
