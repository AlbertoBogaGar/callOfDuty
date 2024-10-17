package edu.alonso.daw.cod;

import java.util.Scanner;

public class Init {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// Creación del usuario
		// Usuario usuario = registroUsuario();
		
		Usuario usuario = new Usuario("Fran");
		
		// Creación del inventario
		InventarioController inventario = new InventarioController();
		
		
		
		System.err.println("\nBienvenido al campo de batalla, " + usuario.getNombre());

		while (true) {
			System.out.println("\n---------------------------------");
			System.out.println("\nMenú:\n");
			System.out.println("1. Mostrar Inventario");
			System.out.println("2. Añadir armas a la mochila");
			System.out.println("3. Añadir accesorios a la mochila");
			System.out.println("4. Equipar");
			System.out.println("5. Desequipar");
			System.out.println("0. Salir");
			System.out.println("\n---------------------------------");

			System.out.print("\nSeleccione una opción: ");
			int opcion = sc.nextInt();
			System.out.println("\n---------------------------------");

			switch (opcion) {
			case 1:
				inventario.mostrarInventario();
				break;
			case 2:
				// InventarioController.addArma(usuario, teclado); //Aquí dentro elegiremos
				// principal, secundaria y accesorios (mira, silenciador, etc)
				break;
			case 3:
				// InventarioController.addAccesorio(usuario, teclado);
				break;
			case 4:
				// InventarioController.equipar(usuario, teclado);
				break;
			case 5:
				// InventarioController.desequipar(usuario, teclado);
				break;
			case 0:
				System.err.println("\nSaliendo.");
				
				break;
			default:
				System.err.println("\nOpción no válida.");
			}
		}
		
	}

	private static Usuario registroUsuario() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce tu nombre, soldado: ");

		String nombreUsuario = sc.next();
		Usuario usuario = new Usuario(nombreUsuario);
		sc.close();

		return usuario;
	}
}
