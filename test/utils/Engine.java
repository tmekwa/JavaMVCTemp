package test.utils;

import test.models.NamesModel;

public class Engine
{
    private static NamesModel _namesModel;

    public static void printNames(NamesModel model)
    {
        _namesModel = model;

        System.out.println("Engine called!");    
        System.out.println(_namesModel.getId());
        System.out.println(_namesModel.getName());  
    }
}