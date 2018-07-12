import test.controllers.NamesController;
import test.models.NamesModel;
import test.utils.Engine;
import test.views.DisplayNamesView;

public class Main
{
    public static void main(String[] args) 
    {
        new NamesController(new DisplayNamesView());
    }
}