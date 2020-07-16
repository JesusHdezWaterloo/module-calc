package com.jhw.modules.calc;

import com.clean.core.app.services.ExceptionHandler;
import com.clean.swing.app.AbstractSwingApplication;
import com.clean.swing.app.AbstractSwingModule;
import com.clean.swing.app.dashboard.DashBoardSimple;
import com.clean.swing.app.dashboard.DashboardConstants;
import com.jhw.swing.util.icons.icon_svg.IconSVG;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.swing.AbstractAction;

public class CalcSwingModule implements AbstractSwingModule {

    @Override
    public void register(AbstractSwingApplication app) {
        System.out.println("Creando 'Calculadora'");
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

    /**
     * Dont need navigation
     *
     * @param string
     * @param o
     */
    @Override
    public void navigateTo(String string, Object... o) {
    }

}
