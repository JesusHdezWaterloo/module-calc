/*
 * Copyright 2021 Root101 (jhernandezb96@gmail.com, +53-5-426-8660).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Or read it directly from LICENCE.txt file at the root of this project.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.root101.module.util.calc;

import com.root101.clean.swing.app.AbstractSwingApplication;
import com.root101.clean.swing.app.DefaultAbstractSwingMainModule;
import com.root101.clean.swing.app.dashboard.DashBoardSimple;
import com.root101.clean.swing.app.dashboard.DashboardConstants;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
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
