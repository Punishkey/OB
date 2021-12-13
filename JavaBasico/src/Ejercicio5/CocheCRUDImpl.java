package Ejercicio5;

public class CocheCRUDImpl implements CocheCRUD{
    public CocheCRUDImpl() {}

    @Override
    public void save() {
        System.out.println("save");
    }

    @Override
    public void findAll() {
        System.out.println("findAll");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }
}
