package test.models;

public class NamesModel
{

    private int _id;
    private int _idCounter = 1;
    private String _name;

    public  NamesModel()
    {
        _id = getNextId();
    }
    public void setName(String name)
    {
        this._name = name;
    }

    public String getName()
    {
        return this._name;
    }

    private int getNextId()
    {
        return (_idCounter++);
    }

    public int getId()
    {
        return (_id);
    }
}