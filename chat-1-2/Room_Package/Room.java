package Room_Package;

import client.Client;

import java.util.ArrayList;

public class Room {

    int identity;
    ArrayList<Client> clients;

    public Room(int identity){
        this.clients = new ArrayList<Client>();
        this.identity = identity;
    }

    public boolean checkClient(Client c){ return this.clients.contains(c);}

    public void connect_to_room(Client c) {this.clients.add(c);}

    public void disconnect_from_room(Client c) {this.clients.remove(c);}

    public ArrayList<Client> getClients() { return this.clients; }

    public int getId() { return this.identity;}

    public int get_number_of_clients() {return this.clients.size();}


}
