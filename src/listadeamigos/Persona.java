package listadeamigos;


public class Persona {
	   String id;
	   Persona[] amigos; // sus amigos (null si no apunta a nadie)
	   int NUMAMIGOS = 10;
	   
	   public Persona(String id){
		   this.id = id;
		   amigos = new Persona[NUMAMIGOS];
	   }
	   
	   
	   public Persona eliminarReferencias(String referencia) {
		   for(int i =0; i<amigos.length;i++) {
			   if(amigos[i] != null) {
				   if( amigos[i].id.equals(referencia) ) {
					   amigos[i] = null;
				   }
			   }
		   }
		   return this;
	   }
}
