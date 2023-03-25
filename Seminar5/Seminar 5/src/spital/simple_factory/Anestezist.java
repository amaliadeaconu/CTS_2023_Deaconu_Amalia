package spital.simple_factory;

public class Anestezist extends PersonalSpital{
    private int aniVechime;

    public Anestezist(String nume,int aniVechime) {
        super(nume);
        this.aniVechime=aniVechime;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(super.getNume()+" este anestezist si are "+this.aniVechime+" ani vechime");
    }
}
