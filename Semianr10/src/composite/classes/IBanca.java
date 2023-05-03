package composite.classes;

public interface IBanca {
    void descriere();
    void adaugaNod(IBanca a);
    void stergeNod(IBanca a);
    void getNod(int index);
}
