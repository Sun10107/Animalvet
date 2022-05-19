import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PetClinic {
  String name;

   Map<Client, HashSet<Pet>> clients=new HashMap<>();
    private Object Pet;


    public PetClinic(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  public void addClient(Client client,PetClinic petClinic) {
      if (clients.containsKey(clients)) {
          System.out.println("Такой клиент уже есть");
      } else {

          clients.put(client, new HashSet<Pet>());
      }
  }
     public void addPetToClient(Client client,Pet pet) {
         if (clients.containsKey(client)) {
         }
         else {
         }}

     public void addClient(Client client,PetClinic petClinic) {
         System.out.println("2222");
     }

  }

