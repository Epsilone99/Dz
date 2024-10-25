package OOP1;

import java.util.HashSet;

import static OOP1.Tree.mom;

public class GenSmbdy{
    static Children child1;
    static Parentsmom mom;
    static Parents dad;
    static HashSet<Person> fam;

    protected static HashSet<Person> TreGen() {
        mom = new Parentsmom("Женский", 22, "Сара", "13.07.2001", "");
        dad = new Parents("Mужской", 25, "Джон", "14.12.1999", "");
        child1 = new Children("Mужской", 2, "Дин", "03.09.2023", dad.getName(), mom.getName());
        mom.setMotherOf(child1.getName());
        dad.setFather(child1.getName());
        fam = new HashSet<>();
        fam.add(child1);
        fam.add(mom);
        fam.add(dad);
        return fam;
    }
}
