package Coche;

public class CocheCRUDImpl implements CocheCRUD
{
    public CocheCRUDImpl(){}

    @Override
    public void save() {
        getMethodName("save");
    }

    @Override
    public void findAll() {
        getMethodName("findAll");
    }

    @Override
    public void delete() {
        getMethodName("delete");
    }

    private void getMethodName(String methodName){
        System.out.println("Method: " + methodName);
    }
}
