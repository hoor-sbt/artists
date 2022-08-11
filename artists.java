
package artists;

public class artists {
    
    private String name;
    private String FamousPainting;
    
    
    public artists (String name, String fp){
        this.name=name;
        FamousPainting = fp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFamousPainting(String FamousPainting) {
        this.FamousPainting = FamousPainting;
    }

    public String getName() {
        return name;
    }

    public String getFamousPainting() {
        return FamousPainting;
    }
    public void display(){
           System.out.println("Artist's name: "+name);
        System.out.println("the artist's most famous painting is "+FamousPainting);
    }
}
