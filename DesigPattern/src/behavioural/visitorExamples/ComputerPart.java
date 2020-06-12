package behavioural.visitorExamples;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
