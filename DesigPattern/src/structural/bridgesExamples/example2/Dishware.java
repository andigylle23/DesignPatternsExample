package structural.bridgesExamples.example2;

public abstract  class Dishware {
    protected MaterialAPI materialAPI;

    protected Dishware(MaterialAPI materialAPI) {
        this.materialAPI = materialAPI;
    }

    public abstract void assignMaterial();
}
