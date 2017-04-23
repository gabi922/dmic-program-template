package org.dmic.program.{programname};

import org.apache.flink.api.java.ExecutionEnvironment;

public class Main {

	public static void main(String[] args) throws Exception {
		final ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();

		// Generate the program	

		// execute program
		env.execute("Flink Batch Java API Skeleton");
	}
}
