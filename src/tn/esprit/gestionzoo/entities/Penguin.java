package tn.esprit.gestionzoo.entities;

public final class Penguin extends Aquatic {
    private float swimmingDepth ;
    public Penguin(){
        super();
    }

    @Override
    public void swim() {

    }

    public Penguin(String family,String name,int age,boolean isMammal,String habitat,float swimmingDepth ){
        super(family, name, age, isMammal, habitat);
        this .swimmingDepth = swimmingDepth ;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }
    @Override
    public String toString(){
        return super.toString() + "swimmingDepth: " +swimmingDepth ;
    }
}
