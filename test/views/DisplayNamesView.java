package test.views;

import java.util.Scanner;
import test.models.NamesModel;

public class DisplayNamesView
{
    private NamesModel _model;

    public DisplayNamesView()
    {
        promptUser();
    }

    public void promptUser()
    {
        NamesModel model = new NamesModel();
        Scanner scan = new Scanner(System.in);
        String name = "";
        
        System.out.println("Please enter your name:");
        name = "+> " + scan.nextLine();
        model.setName(name);
        _model = model;
    }
    
    public NamesModel getModel()
    {
        return _model;
    }
}