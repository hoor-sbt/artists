
package artists;


public class Artinlife {

    private final int muesuemid;
    private String name;
    private String Arttype;
    
    private artists artists;

    //constuructor
    public Artinlife (int m, String name,String Atype ,  artists artists){
     muesuemid=m;
        this.name=name;
        Arttype=Atype;
        this.artists=artists;
        
        //setters
        
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setArttype(String Arttype) {
        this.Arttype = Arttype;
    }

    public void setArtists(artists artists) {
        this.artists = artists;
    }
    //getters

    public int getMuesuemid() {
        return muesuemid;
    }

    public String getName() {
        return name;
    }

    public String getArttype() {
        return Arttype;
    }

    public artists getArtists() {
        return artists;
    }
    
    
    //methods
    public void display(){
        System.out.println("the muesuem id is: "+muesuemid);
        System.out.println("the artist name is: "+name);
           System.out.println("what type of art is it? "+Arttype);
      artists.display();
    }
}
