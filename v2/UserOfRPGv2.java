public class UserOfRPGv2 {

    //I predict this wont compile because there are no subclasses
    //in monster called Brutus or Protagonist etc. CORRECT
    
    private static Character[] agents;
    //private static Monster[] agents;
    public static void main(String[] args) {
        agents = new Character[8];
	//agents = new Monster[8];
	
	agents[0] = new Protagonist("jeff");
	agents[1] = new Brutus();
	agents[2] = new Terry();
	agents[3] = new Teeny();

	//Now only Monster's are instantiated
	agents[4] = new Monster();
	agents[5] = new Wolf();
	agents[6] = new CSDept();
	agents[7] = new CeramicBloon();


	for (Character agent: agents) {
	    System.out.println(agent.toString());
	}

	//I predit this wont compile because Monsters do not have the field name
	//CORRECT
	// for (Character agent: agents) {
	//     System.out.println(agent.getName());
	//}
    }
}
