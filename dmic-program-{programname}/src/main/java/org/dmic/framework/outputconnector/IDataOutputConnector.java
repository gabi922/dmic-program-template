package org.dmic.framework.outputconnector;

import org.apache.flink.api.java.DataSet;

public interface IDataOutputConnector<T> {
    void writeDataSet(DataSet<? extends T> dataSet);
}