package tn.esprit.gestionzoo.entities;

public non-sealed abstract class Aquatic extends Animal {
    private  String habitat ;
    public Aquatic() {
    }
    public Aquatic(String family,String name,int age,boolean isMammal,String habitat )
    {
        super (family, name, age, isMammal);
        this.habitat = habitat ;
    }
    public String getHabitat(){ return habitat ;}
    public void setHabitat (String habitat) { this.habitat = habitat ;}

    public abstract void swim();
    @Override
    public String toString(){
        return super.toString() + "Habitat : " +habitat ;
    }

    //instruction 31
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        if (!super.equals(obj)) return false;

        Aquatic aquatic = (Aquatic) obj;
        return habitat.equals(aquatic.habitat);
    }
}
