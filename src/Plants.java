public class Plants implements VattnaVäxt{
    //Private variabler då alla subklasser använder sig av super för att skapa och getters för att kom åt dom
    private String name;
    private double height;

    public Plants(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void vattnaVäxt() {
        System.out.println("Om du inte vet vad det är för växt - kolla om jorden är torr, om ja - ge den ett glas vatten");
    }
}

