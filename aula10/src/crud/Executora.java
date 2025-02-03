package crud;

public class Executora {

	public static void main(String[] args) {
		Estudante e = new Estudante(2, "Asdrubal Ling", "Araquari");
		EstudanteCRUD estCRUD = new EstudanteCRUD(); 
		estCRUD.connectionDB();
		
		// ====Create do CRUD==================
		//estCRUD.createEstudante(e);
		
	// ====Read do CRUD==================
			estCRUD.readEstudante();
	
		// ====Update do CRUD==================
						
		//estCRUD.upadateEstudante("Severina", "Pirabeiraba", 10);		
	// ====Delete do CRUD==================
		
		//estCRUD.deleteProduto(10);
	
	}

}
