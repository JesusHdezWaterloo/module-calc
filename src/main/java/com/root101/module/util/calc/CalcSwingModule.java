package com.root101.module.util.calc;

import com.root101.clean.swing.app.AbstractSwingApplication;
import com.root101.clean.swing.app.DefaultAbstractSwingMainModule;
import com.root101.clean.swing.app.dashboard.DashBoardSimple;
import com.root101.clean.swing.app.dashboard.DashboardConstants;

public class CalcSwingModule extends DefaultAbstractSwingMainModule {

    private CalcSwingModule() {
    }

    public static CalcSwingModule init() {
        System.out.println("Iniciando 'Calculadora'");
        return new CalcSwingModule();
    }

    @Override
    public void register(AbstractSwingApplication app) {
        registerCalc(app);
    }

    private void registerCalc(AbstractSwingApplication app) {
        DashBoardSimple dash = app.rootView().dashboard();

        dash.addKeyValue(DashboardConstants.UP_ELEMENT, CalcAction.from());
    }

}
