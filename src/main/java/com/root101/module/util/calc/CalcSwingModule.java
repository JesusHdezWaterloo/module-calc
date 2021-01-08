package com.root101.module.util.calc;

import com.root101.clean.core.app.services.ExceptionHandler;
import com.root101.clean.swing.app.AbstractSwingApplication;
import com.root101.clean.swing.app.DefaultAbstractSwingMainModule;
import com.root101.clean.swing.app.dashboard.DashBoardSimple;
import com.root101.clean.swing.app.dashboard.DashboardConstants;
import com.root101.swing.derivable_icons.IconSVG;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.swing.AbstractAction;

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

        IconSVG CALC = new IconSVG(getClass().getResourceAsStream("/calc.svg"));
        dash.addKeyValue(DashboardConstants.UP_ELEMENT, new AbstractAction("Calculadora", CALC) {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Runtime.getRuntime().exec("calc");
                } catch (IOException ex) {
                    ExceptionHandler.handleException(ex);
                }
            }
        });
    }

}
