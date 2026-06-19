class Ticket{
    private String name;
    private int id;
    public double price;
    Ticket(String name,int id){
        this.name=name;
        this.id=id;
    }
    public void displayInformation(){
        System.out.println("Ticket id : " + id);
        System.out.println("Ticket holder name : "+name);
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public double generateTicketPrice(double price){
        return price;
    }

}
class Fans extends Ticket{
    private String galleryType;
    Fans(String name,int id,String galleryType){
        super(name,id);
        this.galleryType=galleryType;
    }
    public String getGalleryType(){
        return galleryType;
    }
    public void setGalleryType(String galleryType){
        this.galleryType = galleryType;
    }
    public double generateTicketPrice(double price){
        return (price+(price*.15));
    }
    public void displayInformation(){
        super.displayInformation();
        System.out.println("Gallery Type : " + galleryType);
        System.out.println("Ticket Price : " + price);

    }


}
class Players extends Ticket{
    private String teamName;
    private String role;
    private int playerId;
    Players(String name,int id,String teamName,String role,int  playerId){
        super(name,id);
        this.teamName=teamName;
        this.role=role;
        this.playerId=playerId;
    }
    public String getteamName(){
        return teamName;
    }
    public void setteamName(String teamName){
        this.teamName = teamName;
    }
    public String getRole(){
        return role;
    }
    public void setRole(String role){
        this.role = role;
    }
    public int getPlayerId(){
        return playerId;
    }
    public void setplayerId(int playerId){
        this.playerId = this.playerId;
    }
    public double generateTicketPrice(double price){
        return ((price*.4)+(price*.25));
    }
    public void displayInformation(){
        super.displayInformation();
        System.out.println("Team Name : " + teamName);
        System.out.println("Role : " + role);
        System.out.println("Player Id : " + playerId);
        System.out.println("Ticket Price : " + price);
    }

}
class MatchOfficial extends Ticket{
    private int officeId;
    private String Role;
    MatchOfficial(String name,int id,int officeId,String Role){
        super(name,id);
        this.officeId=officeId;
        this.Role=Role;
    }
    public double generateTicketPrice(double price){
        return ((price*.4)+((price*.4)*.20));
    }
    public void displayInformation(){
        super.displayInformation();
        System.out.println("Office Id : " + officeId);
        System.out.println("Role : " + Role);
        System.out.println("Ticket Price : " + price);
    }
}

public class TicketManagement {
    public static void main(String[] args){
        Fans f1 = new Fans("Ariyan",342223,"Eastern");
        f1.price= f1.generateTicketPrice(1000.00);
        f1.displayInformation();
        System.out.println("-----------------------------");

        Players p1 = new Players("Niloy",342224,"India","Midfielder",534);
        p1.price= p1.generateTicketPrice(1000.00);
        p1.displayInformation();
        System.out.println("-----------------------------");

        MatchOfficial m1= new MatchOfficial("Arnab",342225,345,"Referee");
        m1.price= m1.generateTicketPrice(1000.00);
        m1.displayInformation();

    }
}
