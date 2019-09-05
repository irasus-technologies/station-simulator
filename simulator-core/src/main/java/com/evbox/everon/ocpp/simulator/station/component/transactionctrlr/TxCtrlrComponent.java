package com.evbox.everon.ocpp.simulator.station.component.transactionctrlr;

import com.evbox.everon.ocpp.simulator.station.Station;
import com.evbox.everon.ocpp.simulator.station.StationState;
import com.evbox.everon.ocpp.simulator.station.component.StationComponent;
import com.google.common.collect.ImmutableList;

/**
 * Representation of Transaction component according to OCPP 2.0 (3.1.15. TxCtrlr)
 */
public class TxCtrlrComponent extends StationComponent {

    public static final String NAME = "TxCtrlr";

    public TxCtrlrComponent(Station station, StationState stationState) {
        super(ImmutableList.of(
                new EVConnectionTimeOutVariableAccessor(station, stationState)
        ));
    }

    @Override
    public String getComponentName() {
        return NAME;
    }
}
