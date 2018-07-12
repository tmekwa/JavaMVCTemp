package test.controllers;

import test.models.NamesModel;
import test.utils.Engine;
import test.views.DisplayNamesView;

public class NamesController
{
    private DisplayNamesView _view;
    private NamesModel _model;

    public NamesController(DisplayNamesView view)
    {
        this._view = view;
        sendToModel();
    }

    public void sendToModel()
    {
        _model = this._view.getModel();
        Engine.printNames(_model);
    }
}