package org.dmic.framework.inputconnector;

import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;

public interface IDataInputConnector<T> {
    DataSet<? extends T> readDataSet(ExecutionEnvironment env);
}